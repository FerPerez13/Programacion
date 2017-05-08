
package ASIGNATURAS;

public class EjecutaAsignatura {

    public static void main(String[] args) {
        Asignatura matematicas = new Asignatura("Matemáticas", "Curso 1", 1017);
        Asignatura programacion = new Asignatura("Programación", "1ºD.A.M", 1545);
        Asignatura redes = new Asignatura("Redes", "1ºA.S.I", 1648);

        matematicas.imprimeAsignatura();
        programacion.imprimeAsignatura();
    }
}
