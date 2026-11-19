/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;
import java.util.Scanner;
/**
 *2. Hacer un programa que pida diez valor de tipo entero al usuario y nos muestre por pantalla la media  de esos diez valores
 * 
 * @author IFC303_1
 */
public class Ejercicio2Examen {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int suma=0;
        int valor=0;
        for(int i=0;i<10;i++){
        System.out.println("Dime un valor");
         valor= teclado.nextInt();
         suma+=valor;
        }
        System.out.println("La media de los valor es= "+ (suma/10));
        System.out.println(sumaw);
        
        
        
        
    }
}
