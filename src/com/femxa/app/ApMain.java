package com.femxa.app;

public class ApMain {

    public static void main(String[] args) {
        // TODO code application logic here

        //Datos primitivos númericos enteros de menor a mayor
        byte maxByte = 127;
        maxByte++; // maxByte = maxByte + 1;
        System.out.println("Número máximo maxByte = "+ maxByte);
        short maxShort = Short.MAX_VALUE; 
        System.out.println("Número máximo short = " + maxShort);
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Número máximo int = " + maxInt);
        long maxLong = Long.MAX_VALUE;
        System.out.println("Número máximo long = " + maxLong);
        //int 4num = 10; //Error de compilación los nombres no pueden empezar con números
        //var var = 5; //Este identificador es legal, pero no es una buena práctica

        //Datos primitivos númericos con punto flotante (decimales) de menor a mayor
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Número máximo float = " + String.format("%.2f", maxFloat));
       //System.out.printf("Número máximo float = %.2f ", maxFloat);
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Número máximo double = "+ String.format("%.2f", maxDouble));
        
        //Prácticas
        long numLong = 9_223_372_036_854_775_807L;
        numLong = (long) maxFloat;
        float numFloat = 9f; 
        int numInt = 2;
        float result = (int) numFloat / numInt; // 4.0
        System.out.println(result);
        System.out.print(1+2+" ");
        System.out.println(""+(1+2));
        
        //Datos primitivos no númericos
        char caracter = 'C'; //Character -> Clase Wrapper (Clase Envoltorio)
        caracter = 65;
        caracter++; // caracter
        caracter = (char) maxByte;
        caracter = '\u0041';
        System.out.println(caracter);
        
        boolean condicional = true;
        condicional = numInt == numFloat;
        System.out.println(condicional);
        
        // String (Cadena de caracteres)
        String text = "Luke yo soy tu padre";
        //length() -> Obtenemos el número de caracteres 
        int textSize = text.length();
        System.out.println("La frase tiene "+textSize+" caracteres.");
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
        //
        System.out.println(text.substring(text.length()-5, text.length()-2));
        
        String numeroEnTexto = String.valueOf(numLong);
        String numeroEnTexto2 = ""+numLong;
        
    }
}
