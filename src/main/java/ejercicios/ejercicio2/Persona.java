/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio2;

/**
 *
 * @author Josue Pujols
 */
public class Persona {
    private String Nombre;
    private int Edad;
    private String DNI;
    private String Sexo;
    private double Peso;
    private int Altura;
    
    //Metodos get
    public String GetNombre() {
        return this.Nombre;
    }
    
    //Default constructor
    public Persona() {
        this.Nombre = "";
        this.Edad = 0;
        this.DNI = "";
        this.Sexo = "Hombre";
        this.Peso = 0;
        this.Altura = 0;
    }
    
    //This is the second constructor with 3 properties
    public Persona(String Nombre, int Edad, String Sexo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
    }
    
    //This is the last constructor with all the properties
    public Persona(String Nombre, int Edad, String Sexo, double Peso, int Altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Altura = Altura;
    }
    
    //Method to calc IMC
    public int CalcularIMC() {
        //Creo una variable result para englobar el resultado 
        int result = 0;
        //Caculo el peso a Kg porque lo pedire en libras
        double PesoKG  = this.Peso / 2.2;
        //Aplico la formula 
        double PesoFinal = PesoKG/(this.Altura ^ 2);
        
        if (PesoFinal < 20) {
            result = -1;
        }
        else if (PesoFinal >= 20 && PesoFinal <= 25) {
            result = 0;
        }
        else if (PesoFinal > 25) {
            result = 1;
        }
        
        return result;
    }
    
    //Method to calc age
    public boolean esMayorDeEdad() {
        boolean result = false;
        
        if (this.Edad >= 18) {
            result = true;
        }
        else {
            result = false;
        }
        
        return result;
    }
    
    //Methodtu return all the object
    public Persona ToString() {
        return this;
    }
    
}
