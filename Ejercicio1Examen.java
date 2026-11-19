/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;
import java.util.Scanner;
/**
 * 1. Hacer una funcion a la que le pasaremos un valor double que nos mostrara por pantalla si es par o impar
 * @author IFC303_1
 */
public class Ejercicio1Examen {
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        System.out.println("Dime un valor");
        double num= teclado.nextDouble();
       paroImpar(num);
    }
    static void paroImpar(double a){
   a= a%2;
   if (a==0){
       System.out.println("El numero es par");
   }
   else 
            System.out.println("El numero es impar");
    }
    
    
    
    
}
