/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutable05 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
    
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();
        
        System.out.println("Ingrese el nombre del Hospital: ");
        String n1 = entrada.nextLine();
        h1.establecerNombre(n1);
        System.out.println("Ingrese el número de camas del Hospital: ");
        int camas = entrada.nextInt();
        h1.establecerNumeroCamas(camas);
        System.out.println("Ingrese el valor del presupuesto del Hospital: ");
        double valor1 = entrada.nextDouble();
        h1.establecerPresupuesto(valor1);
        entrada.nextLine();

        System.out.println("Ingrese el nombre del Hospital: ");
        n1 = entrada.nextLine();
        h2.establecerNombre(n1);
        System.out.println("Ingrese el número de camas del Hospital: ");
        camas = entrada.nextInt();
        h2.establecerNumeroCamas(camas);
        System.out.println("Ingrese el valor del presupuesto del Hospital: ");
        valor1 = entrada.nextDouble();
        h2.establecerPresupuesto(valor1);
        entrada.nextLine();

        System.out.println("Ingrese el nombre del Hospital: ");
        n1 = entrada.nextLine();
        h3.establecerNombre(n1);
        System.out.println("Ingrese el número de camas del Hospital: ");
        camas = entrada.nextInt();
        h3.establecerNumeroCamas(camas);
        System.out.println("Ingrese el valor del presupuesto del Hospital: ");
        valor1 = entrada.nextDouble();
        h3.establecerPresupuesto(valor1);
        
        
        double suma = h1.obtenerPresupuesto() + h2.obtenerPresupuesto() +
                h3.obtenerPresupuesto();
        
        int sumaCamas = h1.obtenerNumeroCamas() + h2.obtenerNumeroCamas() +
                h3.obtenerNumeroCamas();
        
        System.out.printf("La suma de presupuestos es: %.2f\n", suma);
        System.out.printf("La suma de camas de los hospitales es: %d\n", sumaCamas);
        System.out.println("Los Hospitales ingresados fueron: ");
        System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(),
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        System.out.printf("%s - %d - %.2f\n", h2.obtenerNombre(),
                h2.obtenerNumeroCamas(), h2.obtenerPresupuesto());
        System.out.printf("%s - %d - %.2f\n", h3.obtenerNombre(),
                h3.obtenerNumeroCamas(), h3.obtenerPresupuesto());
        
    }
}
