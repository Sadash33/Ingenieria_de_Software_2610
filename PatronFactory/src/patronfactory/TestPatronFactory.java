/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronfactory;

import java.util.Scanner;

/**
 *
 * @author dfgf
 */
public class TestPatronFactory {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
        
        System.out.println("¿Qué deseas comprar?");
        System.out.println(Producto.Compu_gamer + ") Laptop Gamer Alienware");
        System.out.println(Producto.Compu_esc + ") Computadora escolar HP");
        System.out.println(Producto.Tel_android + ") Motorola G7 Power");
        System.out.println(Producto.Tel_iphone + ") IPhone 11");
        System.out.println(Producto.Tablet_sam + ") Samsung Galaxy Tab S6 Lite");
        System.out.println(Producto.Tablet_gen + ") Hyundai Hytab");
        
        try {
            System.out.print("Elige el número:");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No capturaste un número!");
        }
        
        Producto dispositivo = PatronFactory.createProducto(eleccion);
        System.out.println(dispositivo.toString());
        
    }
    
}
