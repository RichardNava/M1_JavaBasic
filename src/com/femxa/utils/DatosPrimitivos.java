package com.femxa.utils;

public class DatosPrimitivos {
    
    //[modo_de_acceso][tipo_de_devolución][identificador][( Parametros... si los hubiera )][{}]
    public void showMaxPrimitives(){
        //Datos primitivos númericos enteros de menor a mayor
        byte maxByte = 127;
        maxByte++; // maxByte = maxByte + 1;
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
    
}
