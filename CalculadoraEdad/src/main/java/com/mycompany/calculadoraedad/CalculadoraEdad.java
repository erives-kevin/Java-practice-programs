package com.mycompany.calculadoraedad;

import java.util.Scanner;

/**
 *
 * @author erive
 */
public class CalculadoraEdad {

    public static void main(String[] args) {
       
        // 1. Preparacion del Scanner  (oido que escucha al usuario)
        Scanner entrada = new Scanner(System.in);
        
        // 2. Imprimir Instrucciones
        System.out.println("=== INICIANDO SISTEMA DE BIENVENIDA ===");
        System.out.println("Hola, Ingrese su nombre porfavor: ");
        
        // 3. ENTRADA: Se lee lo que escribe el usuario y se guarda en la variable "nombre"
        String nombre = entrada.nextLine();
        
        // 4. Saludar
        System.out.println("Mucho gusto " + nombre + ".");
        
        // 5. Preguntar el año de nacimiento
        System.out.println("En que año naciste?: ");
        
        // 6. ENTRADA: Leer el año de nacimiento y guardarlo en la variable
        int añoNacimiento = entrada.nextInt();
        
        // 7. PROCESO: Calcular edad actual
        int edad = 2025 - añoNacimiento;
        
        //8. Mostrar edad
        System.out.println("----------------");
        System.out.println("Tienes " + edad + "Años!");
        
        
        
        
        
        
        
    }
}
