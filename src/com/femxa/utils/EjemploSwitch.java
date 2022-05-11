package com.femxa.utils;

import java.awt.BorderLayout;

public class EjemploSwitch {

    public void diaSemana(int n) {
        switch (n) { // n==case
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No hay un día de la semana con ese digito");
        }
    }

    public void horasDia(int n) {
        switch (n) {
            case 22:
            case 23:
            case 24:
            case 1,2,3,4,5,6: // i>0 && i<7
                System.out.println("Buenas noches");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Buenos días");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                System.out.println("Buenas tardes");
                break;
            default:
                throw new AssertionError();
        }
    }

    public void menuNombre(String user, String password) {
        switch (user.trim().toLowerCase()) {
            default:
                throw new AssertionError();
            case "Ramon123" , "RAMON123" , "ramon123":
                break;
            case "virginia@12":
                break;
        }
    }

    public int charSwitch(char c) {
        int a = 10;
        switch (c) {
            case 'a' , 65:
                a = 8;
            case 'b' | 66:
                a++;
                break;
            case 'c' | 67:
                a=15;
                break;
            default:
                System.out.println("Hola");
        }
        return a;
    }
}
