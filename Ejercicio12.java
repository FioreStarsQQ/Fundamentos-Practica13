
/*
EJERCICIO 12:  Se desea calificar en palabras una nota, según el siguiente
criterio:
 0.0 a 4.9 : reprobado, repite el semestre
 5.0 a 10.4: reprobado, pasa a subsanación
 10.5 a 15.9: aprobado
 16.0 a 20.0: aprobado con distinción máxima
POR: Fiorela Clariza Quispe Quispe
*/

import java.util.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        double nota;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bienvenido(a), a continuación ingrese su nota: ");
        nota = scan.nextDouble();

        if (nota >= 00 && nota < 5) {
            System.out.println("Usted está reprobado, repite el semestre.");
        } else {
            if (nota < 10.5) {
                System.out.println("Usted está reprobado, pasa a subsanación.");
            } else {
                if (nota < 16) {
                    System.out.println("Usted está aprobado.");
                } else {
                    if (nota <= 20) {
                        System.out.println("Usted está aprobado con distinción máxima.");
                    } else {
                        System.out.println("¡ERROR! Debe ingresar un valor válido.");
                    }
                }
            }
        }
        scan.close();
    }
}