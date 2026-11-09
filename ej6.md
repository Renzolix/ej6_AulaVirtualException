# Ejercicio 6: AulaVirtualException

## Explicación Lógica
1. **Protección del Estado Operativo:** Impide ejecutar métodos de negocio (`tomarAsistencia`) cuando las condiciones del objeto no son las adecuadas (`enSesion == false`).
2. **Manejo de Transición:** Asegura que las operaciones del sistema respeten el ciclo de vida esperado en el entorno virtual.