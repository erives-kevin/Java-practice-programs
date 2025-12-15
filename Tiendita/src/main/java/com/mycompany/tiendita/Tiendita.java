package com.mycompany.tiendita;

import java.util.Scanner;

/**
 *
 * @author erive
 */
public class Tiendita {

    public static void main(String[] args) {
        // 1. Preparacion del Scanner 
        Scanner entrada = new Scanner(System.in);
        
        // 2. Imprimir saludo
        System.out.println("======= BIENVENIDO, ESTIMADO CLIENTE! =======");
        
        // 3. Preguntar producto
        System.out.println("Ingrese el nombre del producto");
        
        // 4. ENTRADA: Se guarda el producto en la variable "producto"
        String producto = entrada.nextLine();
        
        // 5. Preguntar precio
        System.out.println("Precio: ");
        
        // 6. ENTRADA: guardar el precio en la variable "precio"
        double precio = entrada.nextDouble();
        
        // 7. Preguntar cantidad
        System.out.println("Cantidad");
        
        // 8. ENTRADA: guardar cantidad en la variable "cantidad"
        int cantidad = entrada.nextInt();
        
        // 9. PROCESO: Calcular el subtotal
        double subtotal = precio*cantidad;
                
        // 10. PROCESO: Calcular el total
        double total = subtotal*1.16;
                
        // 11. IMPRIMIR TICKET
        System.out.println("================== TICKET DE VENTA ===================");
        System.out.println("PRODUCTO: " + producto);
        System.out.println("CANTIDAD: " + cantidad);
        System.out.println("PRECIO: $" + precio);
        System.out.println("SUBTOTAL: $" + subtotal);
        System.out.println("------------------------------------------------------");
        System.out.println("TOTAL A PAGAR: $" + total);
        System.out.println("------------------------------------------------------");
        System.out.println("=============== GRACIAS POR SU COMPRA ================");
    }
}
