package com.femxa.utils;

import java.util.Arrays;
import java.util.Scanner;

public class Matrices {
    
    // Ejercicio 1: Crear una método que dado un número cree una matriz de números desde 1 
    // hasta dicho número. Imprimir los números impares y devolver la matriz.
    // PROHIBICIÓN: No se pueden usar estructuras IF
    public int[] matNumbers(Scanner sc){
        int[] numbers = new int[sc.nextInt()];       
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }  
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        return numbers;
    }
    
    
    
    
    
    
    
    
    
    public void ejemplos(){
          String[] nombres = new String[4]; // 0 hasta lenght-1
        nombres[0] = "Ricardo";
        nombres[1] = "Adolfo";
        nombres[2] = "Aroa";
        nombres[3] = "Daniel";

        System.out.println(nombres[0]);
        //0   1    2    3
        double[] decimales = new double[]{2.5, 6.8, 9.10, 14.3};
        System.out.println(decimales[3]);

        char[] letras = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(letras));

        Perro perro1 = new Perro("Bobby", "Pitbull", 20.5, "negro");
        Perro perro2 = new Perro("Mandela", "Chihuaua", 2.3, "marron");
        Perro perro3 = new Perro("Smurpy", "Bull Dog", 8.7, "gris");
        Perro perro4 = new Perro("Odin", "American Stanford", 34.3, "blanco");
        perro1.ladrar();
      
        System.out.println(perro1); //perro1.toString();
//        Perro[][] perros = new Perro[2][2];
//        perros[0][0] = perro1;
//        perros[0][1] = perro2;
//        perros[1][0] = perro3;
//        perros[1][1] = perro4;
        //     0                  1          
        Perro[][] perros = {{perro1, perro2}, {perro3, perro4}};
        //  0       1         0      1      
//        System.out.println(perros[0].ladrar());
//        System.out.println(perro1.ladrar());

        int [][][] numeros = new int[][][]
                             { 
                             { {1,5,7},{2,6,8} },
                             { {9,4,3,88} },
                             { {10,20,30} , {60,80,90} , {100,200,300} } 
                             };
        System.out.println(Arrays.toString(numeros[2][2]));
        
        String [][][] cube = new String[2][2][2];
        cube[0][0][0] = "Cuarto de inicio. Sin peligros";
        cube[0][0][1] = "Cuarto de fuego. Peligro";
        cube[0][1][0] = "Cuarto de cuchillos. Peligro";
        cube[0][1][1] = "Cuarto de almohadas. No peligro";
        cube[1][0][0] = "Cuarto de hielo. Depende";
        cube[1][0][1] = "Cuarto de colchonetas. Depende";
        cube[1][1][0] = "Cuarto de rayos laser. Muerte asegurada";
        cube[1][1][1] = "Salida";
        
        Perro [][][] perros3D = new Perro[2][][];
        perros3D[0] = perros; 
        perros3D[1] = perros;
        
        System.out.println(cube[1][1][1]);
    }
    
}
class Perro {

    String nombre;
    String raza;
    double peso;
    String color;

    public Perro(String nombre, String raza, double peso, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.color = color;
    }

    public String ladrar() {
        return nombre + "GUAU GUAU";
    }

    @Override
    public String toString() {
        return "Perro{nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + ", color=" + color + '}';
    }

}
