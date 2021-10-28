/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio2;
import ejercicios.ejercicio2.Persona;
import java.util.Scanner;
/**
 *
 * @author Josue Pujols
 */
public class Ejecutar {
    public static void main(String[] args) { 
        //Instancias
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre:");
        String Nombre = in.nextLine();
        
        System.out.print("Ingrese su edad:");
        int Edad = in.nextInt();
        
        System.out.print("Ingrese su Sexo:");
        String Sexo = in.nextLine();
        
        System.out.print("Ingrese su Peso en libras:");
        double Peso = in.nextDouble();
        
        System.out.print("Ingrese su Altura en Metros:");
        int Altura = in.nextInt();
        
        Persona persona = new Persona();
        Persona persona2 = new Persona(Nombre, Edad, Sexo);
        Persona persona3 = new Persona(Nombre, Edad, Sexo, Peso, Altura);
        
        
    }
}
