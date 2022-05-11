package com.femxa.app;

import com.femxa.utils.Bucles;
import com.femxa.utils.DatosPrimitivos;
import com.femxa.utils.EjemploSwitch;
import com.femxa.utils.EstructuraIf;
import com.femxa.utils.Matrices;
import com.femxa.utils.StringStrBuilder;
import java.util.Arrays;
import java.util.Scanner;

public class ApMain {

    int n = 1000;
    static int i;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creamos un objeto a traves del constructor de nuestra clase DatosPrimitivos
        DatosPrimitivos dp = new DatosPrimitivos();
        //dp.showMaxPrimitives();

        var str = new StringStrBuilder();
        //str.teoriaStr();

        EstructuraIf ei = new EstructuraIf();
        //ei.definirPar(sc);
        //ei.mayorMenor(sc);

        EjemploSwitch es = new EjemploSwitch();
//        es.diaSemana(7);
//        es.horasDia(10);
//        System.out.println(es.charSwitch('A'));
//        Bucles buc = new Bucles();
//        buc.usandoWhile(10.0,sc);
//        System.out.println("------------------------------");
//        buc.usandoDoWhile(10);
//        buc.usandoFor();

        Matrices matrix = new Matrices();
        //matrix.ejemplos();
        matrix.matNumbers(sc);
//        
//        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
//
//        System.out.println(vowels.length);
//
//        char[] forceLetters = "Que la fuerza te acompañe".toCharArray();
//        System.out.println(Arrays.toString(forceLetters));
//
//        for (int j = vowels.length - 1, z= 1, k=0 ; j >= 0; j-=z, z+=k ) { 
//            System.out.print(vowels[j] + " ");
//        }
//        System.out.println("\n");
//
//        int i = vowels.length - 1;
//        for (char v : vowels) { // for each
//            System.out.print(vowels[i] + " ");
//            i--;
//        }
//
//        System.out.println("\n");
//
//        int z = vowels.length - 1;
//        while (z >= 0) {
//            System.out.print(vowels[z] + " ");
//            z--;
//        }

        sc.close();
    }

}

class Array {

    private long length;

    public Array(long length) {
        this.length = length;
    }
}
