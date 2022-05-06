package com.femxa.utils;

import java.util.Scanner;

public class StringStrBuilder {
    
    
    
    public void teoriaStr(){
        Scanner sc = new Scanner(System.in);
        // String (Cadena de caracteres)
        String text = "Luke yo soy tu padre";
        //length() -> Obtenemos el número de caracteres 
        int textSize = text.length();
        System.out.println("La frase tiene " + textSize + " caracteres.");
        //toUpperCase() -> Pasamos el texto a mayusculas
        text = text.toUpperCase();
        System.out.println(text);
        //toLowerCase() -> Pasamos el texto a minusculas
        text = text.toLowerCase();
        System.out.println(text);
        //Creamos otro String y los comparamos con el operador relacional "=="
        String text2 = "Luke yo soy tu padre";
        text2 = text2.toLowerCase();
        boolean compareText = text == text2;
        System.out.println(compareText);
        //equals() -> Comparamos el texto
        compareText = text.equals(text2);
        System.out.println(compareText);
        //substring(int posInicial, int posEnd) -> Devuelve un String con la parte de texto indicada entre el punto inicial (inclusivo) y el punto final (exclusivo)
        System.out.println(text.substring(text.length() - 5, text.length()));
        //charAt(int pos) -> Devuelve un char que corresponde al caracter de la posición indicada
        System.out.println("Introduzca un número entero entre 0 y 20: ");
        int num = sc.nextInt();
        char letra = text.charAt(num);
        System.out.println("El caracter en la posicion " + num + " es:" + letra);
        //indexOf(String text) -> nos devuelve la posición de la primera letra del texto si lo encuentra. Si no, nos devuelve -1.
        System.out.println("Introduce una palabra para buscar en el texto: ");
            //String newText = sc.next();
            //int indexText = text.indexOf(newText);
            //System.out.println("El texto señalado se encuentra en la posición: " + indexText);
        System.out.println("El texto señalado se encuentra en la posición: " + text.indexOf(sc.next()));
            //System.out.println(text.charAt(text.indexOf(sc.next())));
        //replace(CharSequence ch1, CharSequence ch2) -> sustituimos el arg 1 por el arg 2 dentro del String
        text = text.replace("u", "o");
        System.out.println(text);
        //startsWith(String s) y endsWith(String s) -> Devuelve boolean (true/false) si empieza o termina con el argumento indicado
        System.out.println(text.startsWith("loke"));
        System.out.println(text.endsWith("padre"));
        //trim() -> quita los espacios en blanco al principio y al final del texto
        System.out.println(" Hola ".trim());
        //concat(String nuevoTexto) -> concatena nuevo texto con el existente
        text += " cosa nueva"; // similar -> text = text + " cosa nueva";
        text = text.concat(" otra cosa nueva");
        System.out.println(text);

        //STRINGBUILDER -> Es una clase mutable. En lugar de devolver una referencia a un nuevo objeto, modificas el objeto actual cuando operamos con un método
        StringBuilder sb = new StringBuilder(text);
        //reverse()-> Da la vuelta al texto
        System.out.println(sb.reverse());
        //append(tipoDeDato dato)-> concatena nuevo texto con el existente
        System.out.println(sb.append(" algo más"));
        //delete(int posIn, int posFin)-> Señalamos posicion inicial(inclusiva) y posicion final(exclusiva) y eliminamos esa parte del texto
        System.out.println(sb.delete(10, 24));
        //insert(int pos, tipoDeDato dato) -> añade el dato nuevo en la posición indicada
        System.out.println(sb.insert(10, " texto nuevo "));
    }
}
