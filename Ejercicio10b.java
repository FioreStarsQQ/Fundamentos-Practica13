
/*
EJERCICIO 10b:  En una tienda de descuento se efectúa una promoción en la cual se hace un descuento sobre el valor de la compra total según el
color de la bolita que el cliente saque al pagar en caja. Si la bolita es de color blanco no se le hará descuento alguno, si es verde se
le hará un 10% de descuento, si es amarilla un 25%, si es azul un 50% y si es roja un 100%. Determinar la cantidad final que el
cliente deberá pagar por su compra. se sabe que solo hay bolitas de los colores mencionados.
 Realizarlo con if y con switch
POR: Fiorela Clariza Quispe Quispe
*/

import java.util.*;

public class Ejercicio10b {

    public static void main(String[] args) {
        double compra, pagoFinal; // Variables
        int bolaCliente;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido(a), a continuación ingrese el valor de la compra total: ");
        compra = scan.nextDouble();
        System.out.println(
                "Esta es la tabla de codificación de acuerdo al color de la bola seleccionada por el cliente\n- Blanca:\t1\n- Verde:\t2\n- Amarilla:\t3\n- Azul:\t4\n- Roja:\t5");
        System.out.print("Ingrese el codigo correspondiente al color seleccionado por el cliente: ");
        bolaCliente = scan.nextInt();
        switch (bolaCliente) {
            case 1:
                pagoFinal = compra;
                System.out.println(
                        "La bola elegida no aplica ningún descuento, por lo tanto el valor de la compra es:\t"
                                + String.format("%.2f",pagoFinal)+" soles.");
                break;
            case 2:
                pagoFinal = (double) Math.round(compra * 0.90 * 100) / 100;
                System.out.println(
                                "La bola elegida le asignó un descuento del 10%, por lo tanto el valor de la compra es:\t"
                                        + String.format("%.2f",pagoFinal)+" soles.");
                break;
            case 3:
                pagoFinal = (double) Math.round(compra * 0.75 * 100) / 100;
                ;
                System.out.println("La bola elegida le asignó un descuento del 25%, por lo tanto el valor de la compra es:\t"
                                +  String.format("%.2f",pagoFinal)+" soles.");
                break;
            case 4:
                pagoFinal = (double) Math.round(compra * 0.50 * 100) / 100;
                ;
                System.out.println("La bola elegida le asignó un descuento del 50%, por lo tanto el valor de la compra es:\t"
                                +  String.format("%.2f",pagoFinal)+" soles.");
                break;
            case 5:
                System.out.println("¡FELICIDADES! La bola elegida le asignó un descuento del 100%, por lo tanto no realiza pago alguno por la compra.");
                break;
        }
        scan.close();
    }
}