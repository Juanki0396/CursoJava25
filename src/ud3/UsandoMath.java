package ud3;

import java.util.Scanner;

public class UsandoMath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduce el ángulo en grados: ");
        double grados = sc.nextDouble();


        double radFromMath = Math.toRadians(grados);
        double radFromFormula = 2 * Math.PI / 360.0 * grados;

        System.out.println("El ángulo en radianes usando la clase Math es: " + radFromMath);
        System.out.println("El ángulo en radianes usando la fórmula es: " + radFromFormula);
    }
    
}
