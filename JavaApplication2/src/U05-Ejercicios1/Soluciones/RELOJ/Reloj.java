/*
 4. Escribe una clase que represente un reloj que señale la hora, el minuto y el segundo.
a) La clase dispondrá de dos constructores, uno sin parámetros que pone el reloj a 0:0:0 
* y otro al que se le pasa la hora, los minutos y los segundos
Se proporcionarán los siguientes métodos:
b) Uno que da la hora, los minutos y los segundos, separados por el carácter “:”, en una cadena
c) Otro que también da la hora pero en formato 24 horas (como el anterior) o en formato 12, 
* en cuyo caso debe distinguir entre “am” (para las horas de 0 a 11) o “pm” (para las horas de 12 a 23), 
* también en una cadena
d) Un método para poner el reloj en hora. Se le pasa la hora y los minutos, poniendo los segundos a 0
e) Un método para poner el reloj en hora al que, además, se le pasan los segundos
f) Añada al ejercicio anterior un método para poner la hora especificando si es AM o es PM
 */
package RELOJ;

public class Reloj {

    private int hora, minuto, segundo;
    // private String formato;

    public Reloj() {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    public Reloj(int h, int m, int s) {
        //comprobar valores
        if (h > 23 || h < 0 || m < 0 || m > 60 || s < 0 || s > 60) {
            System.out.println("Error en el nuevo reloj. Se inicializa el reloj a 0");
            hora = 0;
            minuto = 0;
            segundo = 0;
        } else {
            hora = h;
            minuto = m;
            segundo = s;
        }
    }

    public void setReloj(int h, int m) {
       this.setReloj(h,m,0);
        
    }
 //Método para poner la hora en formato 24h
    public void setReloj(int h, int m, int s) {
         if (h > 23 || h < 0 || m < 0 || m > 60 || s < 0 || s > 60) {
            System.out.println("Error en la actualización del reloj. No se modifica la hora");
         }else{
        hora = h;
        minuto = m;
        segundo = s;
         }
    }

    //Método para poner la hora en formato AM/PM
    public void setRelojFormato(int h, int m, int s, String form) {
        //0:00 ( no es diu les 24:00) son 12am i 12:00 son las 12pm
        if (h > 12 || h < 0 || m < 0 || m > 60 || s < 0 || s > 60) {
            System.out.println("Error al introducir la hora. La hora no ha sido modificada");
        } else {
            if (form.equalsIgnoreCase("am")) {
                if (h == 12) {
                    hora = 0;
                } else {
                    hora = h;
                }

            }
            if (form.equalsIgnoreCase("pm")) {
                if (h == 12) {
                    hora = h;
                } else {
                    hora = h + 12;
                }
            }
            minuto = m;
            segundo = s;
        }

    }

    public void imprimirReloj() {
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }

    public void imprimirRelojFormato(int formato) {
        if (formato == 24) {
            System.out.println(hora + ":" + minuto + ":" + segundo);
        }
        if (formato == 12) {
            if (hora > 0 && hora < 12) {
                System.out.println(hora + ":" + minuto + ":" + segundo + " AM");
            }
            if (hora == 0) {
                System.out.println("12" + ":" + minuto + ":" + segundo + " AM");
            }
            if (hora == 12) {
                System.out.println("12" + ":" + minuto + ":" + segundo + " PM");
            }
            if (hora >= 13 && hora <= 23)//Hora la 13 porque 13-12 = 1
            {
                System.out.println((hora - 12) + ":" + minuto + ":" + segundo + " PM");
            }
        }

    }
}
