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
public class Ejecutable04 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
    
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();
        
        System.out.println("Ingrese el valor del presupuesto del Hospital: ");
        double valor1 = entrada.nextDouble();
        System.out.println("Ingrese el valor del presupuesto del Hospital: ");
        double valor2 = entrada.nextDouble();
        System.out.println("Ingrese el valor del presupuesto del Hospital: ");
        double valor3 = entrada.nextDouble();
        
        h1.establecerPresupuesto(valor1);
        h2.establecerPresupuesto(valor2);
        h3.establecerPresupuesto(valor3);
        
        double suma = h1.obtenerPresupuesto() + h2.obtenerPresupuesto() +
                h3.obtenerPresupuesto();
        
        System.out.printf("La suma de presupuestos es %.2f\n", suma);
        
        
    }
}
