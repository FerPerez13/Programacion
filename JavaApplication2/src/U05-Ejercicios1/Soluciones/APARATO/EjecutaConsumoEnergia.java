/*
 * 
Escribe un programa para representar el consumo de energía de una instalación eléctrica. 
* Para ello se dispondrá de una clase que representa los aparatos conectados en la instalación, 
* Cada aparato tiene un consumo eléctrico determinado. 
* Al encender un aparato eléctrico, el consumo de energía se incrementa en la potencia 
* de dicho aparato. Al apagarlo se decrementa el consumo. 
* Inicialmente, los aparatos están todos apagados. Además, se desea consultar el consumo total 
* de la instalación.
Hacer un programa que declare tres aparatos eléctricos, una bombilla de 100 watios, 
* un radiador de 2000 watios y una plancha de 1200 watios. 
* El programa imprimirá el consumo nada más crear los objetos. 
* Posteriormente, se enciende la bombilla y la plancha, y el programa imprime el consumo. 
* Luego se apaga la plancha y se enciende le radiador y se vuelve a imprimir el consumo.
 */
package APARATO;

public class EjecutaConsumoEnergia {

    public static void main(String args[]) {
        Aparato bombilla = new Aparato(100);
        Aparato radiador = new Aparato(2000);
        Aparato plancha = new Aparato(1200);

        System.out.println("Inicialmente:");
        Aparato.imprimeConsumoTotal();
        bombilla.setEncendido();
        plancha.setEncendido();
          System.out.println("Después de encender bombilla y plancha:");
        Aparato.imprimeConsumoTotal();
        plancha.setApagado();
        radiador.setEncendido();
          System.out.println("Después de apagar plancha y enciendo radiador:");
        Aparato.imprimeConsumoTotal();


    }
}
