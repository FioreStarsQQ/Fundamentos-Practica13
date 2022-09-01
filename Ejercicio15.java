
/*
EJERCICIO 14:  Suma de fracciones. Usa la siguiente fórmula:
 a + c = ad + bc
 -   -   -------
 b   d      bd
Obtener a, b, c y d, y luego calcule la suma. Si la división no se puede
realizar porque el denominador es cero, despliega un mensaje. Si el
resultado es entero, despliega el valor. Si el resultado es una fracción,
despliegalafracción(sinsimplificarla)
POR: Fiorela Clariza Quispe Quispe
*/

import java.util.*;

public class Ejercicio15 {
    public static void main(String[] args) {
        double a, b, c, d, resultado, mod, numerador, denominador;
        Scanner scan = new Scanner(System.in);
        // Enunciado
        System.out.println(
                "Bienvenido(a), este es un programa que calcula la suma de fracciones.");
        // Entrada: a, b, c, d
        System.out.print("A continuación ingrese el valor de \"a\": ");
        a = scan.nextDouble();
        System.out.print("Ingrese el valor de \"b\": ");
        b = scan.nextDouble();
        System.out.print("Ingrese el valor de \"c\": ");
        c = scan.nextDouble();
        System.out.print("Ingrese el valor de \"d\": ");
        d = scan.nextDouble();
        numerador = (a * d) + (b * c);
        denominador = (b * d);
        resultado = (double) (double) Math.round((numerador / denominador) * 100) / 100;
        mod = resultado * 10 % 10;
        if (mod == 0 && b != 0 && d != 0) {
            System.out.println("Resultado: " + Math.round(resultado));
        } else {
            if (mod > 0 && b != 0 && d != 0) {
                System.out.println("Resultado: " + Math.round(numerador) + "/" + Math.round(denominador));
            } else {
                System.out.println("¡ERROR! El valor de \"b\" y/o \"d\" es cero.");
            }
        }

        scan.close();
    }
}