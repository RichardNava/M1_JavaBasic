package com.femxa.app;

import com.femxa.utils.DatosPrimitivos;
import com.femxa.utils.EstructuraIf;
import com.femxa.utils.StringStrBuilder;
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
        
        int num = 5;
        int num2 = --num; // num = 6 -> num2 = 6
        int num3 = num--; // num = 6 -> num3 = 6 -> num=7
        
        if(num3++<num & ++num2<num){// 7<7 = false & 6<7 = true -> num3=7
            System.out.println("Correcto");
        }

        System.out.println(num+" "+num2+" "+num3);
        
        int a = 2; int b= i+1;
        if((a++>++b) && (++a>5)){
           a+=b; 
        }
        System.out.println(a);
       
        sc.close();
    }
    
}
