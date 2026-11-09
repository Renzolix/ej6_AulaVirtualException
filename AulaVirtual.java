public class AulaVirtual {
    private boolean enSesion;

    public AulaVirtual() {
        this.enSesion = false;
    }

    public void iniciarSesion() {
        this.enSesion = true;
        System.out.println("Sesión del aula virtual iniciada.");
    }

    public void tomarAsistencia() throws EstadoAulaInvalidoException {
        if (!enSesion) {
            throw new EstadoAulaInvalidoException("No es posible tomar asistencia: la sesión del aula virtual no está activa.");
        }
        System.out.println("Asistencia tomada a los estudiantes presentes.");
    }

    public static void main(String[] args) {
        AulaVirtual aula = new AulaVirtual();

        try {
            System.out.println("Intentando tomar asistencia antes de iniciar clase...");
            aula.tomarAsistencia();
        } catch (EstadoAulaInvalidoException e) {
            System.err.println("Error de estado: " + e.getMessage());
        }

        System.out.println("\nIniciando sesión y reintentando...");
        aula.iniciarSesion();
        try {
            aula.tomarAsistencia();
        } catch (EstadoAulaInvalidoException e) {
            System.err.println("Error de estado: " + e.getMessage());
        }
    }
}