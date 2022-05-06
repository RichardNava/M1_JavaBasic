package com.femxa.utils;

public class DatosPrimitivos {
    
    //[modo_de_acceso][tipo_de_devolución][identificador][( Parametros... si los hubiera )][{}]
    public void showMaxPrimitives(){
        //Datos primitivos númericos enteros de menor a mayor
        byte maxByte = 127;
        //maxByte++; // maxByte = maxByte + 1;
        System.out.println("Número máximo maxByte = " + maxByte);
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
        System.out.println("Número máximo double = " + String.format("%.2f", maxDouble));
    }
    
    public void showPracticesDP(){
        //Prácticas
        long numLong = 9_223_372_036_854_775_807L;
        numLong = (long) 56.5f;
        float numFloat = 9f;
        int numInt = 2;
        float result = (int) numFloat / numInt; // 4.0
        System.out.println(result);
        System.out.print(1 + 2 + " ");
        System.out.println("" + (1 + 2));
        byte numB = 1;
        numInt = numB;
        
        
        //Datos primitivos no númericos
        char caracter = 'C'; //Character -> Clase Wrapper (Clase Envoltorio)
        caracter = 65;
        caracter++; // caracter
        caracter = (char) 127;
        caracter = '\u0041';
        System.out.println(caracter);

        boolean condicional = true;
        condicional = numInt == numFloat;
        System.out.println(condicional);
        
        String numeroEnTexto = String.valueOf(numLong);
        String numeroEnTexto2 = "" + numLong;
    }
    
    
}
