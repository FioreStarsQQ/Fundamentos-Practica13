
/*
EJERCICIO 13:  Programa que me muestre las raíces de una ecuación
cuadrática y que me muestre mensajes en caso haya algún
problema
POR: Fiorela Clariza Quispe Quispe
*/

import java.util.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        int a, b, c, discriminante;
        double raiz1, raiz2, valorX;
        Scanner scan = new Scanner(System.in);
        // Enunciado
        System.out.println(
                "Bienvenido(a), este es un programa para calcular las raíces de una ecuación del tipo: ax^2 + bx + c");
        // Entradas de los coeficientes a, b y c
        System.out.print("En base a la ecuación cuadrática, ingrese un valor para el coeficiente \"a\": ");
        a = scan.nextInt();
        System.out.print("Ingrese un valor para el coeficiente \"b\": ");
        b = scan.nextInt();
        System.out.print("Ingrese un valor para el coeficiente \"c\": ");
        c = scan.nextInt();
        // Operaciones para calcular la discriminante y las raices de la ecuación cuandrática
        discriminante = (int) Math.pow(b, 2) - (4 * a * c);
        raiz1 = (double) Math.round((((-1) * b + Math.sqrt(discriminante)) / (2 * a)) * 100) / 100;
        raiz2 = (double) Math.round((((-1) * b - Math.sqrt(discriminante)) / (2 * a)) * 100) / 100;
        // Condicionales para clasificar los valores de las raices y la salida correspondiente
        if (a != 0 && discriminante > 0) {
            System.out.println("El valor de las raices son:\n* " + raiz1 + "\n* " + raiz2);
        } else {
            if (a != 0 && discriminante == 0) {
                System.out.println("Solo existe una raíz y su valor es: " + raiz1);
            } else {
                if (a != 0 && discriminante < 0) {
                    System.out.println("La ecuación no tiene raices reales.");
                } else {
                    valorX = (double) ((-1) * c) / b;
                    System.out.println("La ecuación resultó ser lineal por lo tanto el valor de \"x\" es: " + valorX);
                }
            }
        }
        scan.close();
    }
}