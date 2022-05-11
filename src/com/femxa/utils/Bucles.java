
package com.femxa.utils;

import java.util.Scanner;

public class Bucles {
    
    public void usandoWhile(double n, Scanner sc){
        boolean cond=false;
//        while (cond && n<10) {            
//            n++;
//            System.out.println("n vale: "+n);
//            if(sc.next().equals("Out")){
//                cond=false;
//            }
//        }        
//        
        while (n<10) {            
            n++;
            System.out.println("n vale: "+n);
        }
        
    }
    public void usandoDoWhile(int n){
       // boolean cond= false;
        //int n = 0;
        do {            
            n++;
            System.out.println("Valor de n "+n);
        } while (n<10);
    }
    public void usandoFor(){
        for (;true;) {
          
        } 
    }
    
}
