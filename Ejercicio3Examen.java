/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;
import java.util.Scanner;
/**
 * 3. Hacer un programa que pida dos valores enteros  desde teclado 
 * y que nos muestre por pantalla los divisibles por 5 entre esos dos valores
 * @author IFC303_1
 */
public class Ejercicio3Examen {
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        System.out.println("Dime el primer valor");
        int valor1=teclado.nextInt();
        System.out.println("Dime el segundo valor");
        int valor2=teclado.nextInt();
        if (valor1%5==0){
        System.out.println("El divisible por 5 del primer valor ="+valor1/5);}
        else
        System.out.println("El valor 1 no tiene divisibles por 5");
        if (valor2%5==0){
        System.out.println("El divisible por 5 del segundo valor ="+valor2/5);}
        else
        System.out.println("El valor 2 no tiene divisibles por 5");
        
        
        
    }
}
