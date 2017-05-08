
package Empresa;



public class ExeEmpresa {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.introDatos();
        Empleado empleado1 = new Empleado();
        empleado1.introDatos();
        empleado1.intoSueldo();
        
        persona1.imprimirDatos();
        empleado1.imprimirDatos();
        empleado1.imprimeSueldo();
    }
}
