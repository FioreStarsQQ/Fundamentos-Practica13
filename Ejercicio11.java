
/*
EJERCICIO 11:  Las AFP requieren clasificar a las personas que se jubilarán en el
año de 2010. Existen tres tipos de jubilaciones: por edad, por
antigüedad joven y por antigüedad adulta.
 Las personas adscritas a la jubilación por edad deben tener 60
años o más y una antigüedad en su empleo de menos de 25
años.
 Las personas adscritas a la jubilación por antigüedad joven
deben tener menos de 60 años y una antigüedad en su empleo
de 25 años o más.
 Las personas adscritas a la jubilación por antigüedad adulta
deben tener 60 años o más y una antigüedad en su empleo de
25 años o más.
 En cualquier otro caso indicar que no accede a jubilación
 Determinar en qué tipo de jubilación está adscrita una persona
POR: Fiorela Clariza Quispe Quispe
*/

import java.util.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        int edad, tiempo;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bienvenido(a), a continuación ingrese su edad: ");
        edad = scan.nextInt();
        System.out.print("Ingrese la cantidad de años que se encontró laborando: ");
        tiempo = scan.nextInt();

        if (edad >= 60 && tiempo < 25) {
            System.out.println("Usted pertenece al tipo de jubilación por edad.");
        } else {
            if (edad < 60 && tiempo >= 25) {
                System.out.println("Usted pertenece al tipo de jubilación por antigüedad joven.");
            } else {
                if (edad >= 60 && tiempo >= 25) {
                    System.out.println("Usted pertenece al tipo de jubilación por antigüedad adulta.");
                } else {
                    System.out.println("Usted no accede a jubilación.");
                }
            }
        }
        scan.close();
    }
}