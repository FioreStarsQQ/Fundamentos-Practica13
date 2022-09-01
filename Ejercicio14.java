
/*
EJERCICIO 14:  Haga un programa que determine si un año es bisiesto: si es
divisible por 4, pero no es divisible por 100 o si es divisible
por 400:
 Año ? 1998 Año ? 1996 Año ? 1900 Año ? 2000
    no         si           no           si 
POR: Fiorela Clariza Quispe Quispe
*/

import java.util.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        int año;
        Scanner scan = new Scanner(System.in);
        // Enunciado
        System.out.println(
                "Bienvenido(a), este es un programa que determina si un año es bisiesto o no.");
        // Entrada: año
        System.out.print("A continuación ingrese el año: ");
        año = scan.nextInt();
        // Condicionales para clasificar el año y la salida correspondiente
        if (((año % 4) == 0 && (año % 100) != 0) || año % 400 == 0) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }
        scan.close();
    }
}