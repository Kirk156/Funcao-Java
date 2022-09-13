package com.mycompany.mavenproject2;

import java.util.Scanner;

public class Mavenproject2 {
    
    static void Menu(){
        System.out.println("HELLO THERE!"
                + "\n Escolha uma das opções:\n 1 - SOMA;\n 2 - SUBTRAÇÃO;\n 3 - MULTIPLICAÇÃO;\n 4 - DIVISÃO;\n"
             + " 5 - SAIR");
    }
    
    static int numeroA(){
        int valorA = 0;
        System.out.println("Informe o valor de A: ");
        return valorA;
    }
    
    static int numeroB(){
        int valorB = 0;
        System.out.println("Informe o valor de B: ");
        return valorB;
    }
            
     static String Soma (int a, int b){
         int resultadoSoma = a + b;
         return "A SOMA é: " + resultadoSoma;
     }
     
     static String Subtracao (int a, int b){
         int resultadoSubtracao = a - b;
         return "A SUBTRAÇÃO é: " + resultadoSubtracao;
     }
     
     static String Multiplicacao (int a, int b){
         int resultadoMultiplicacao = a * b;
         return "A MULTIPLICAÇÃO é: " + resultadoMultiplicacao;
     }
     
     static String Divisao (int a, int b){
         int resultadoDivisao = a / b;
         return "A DIVISÃO é: " + resultadoDivisao;
     }
       
    public static void main(String[] args) {
     int a = 0;
     int b = 0;
     int escolha = 0;
     
     Scanner sc = new Scanner(System.in);
     
     
     
     while(escolha != 5){
     Menu();
     escolha = sc.nextInt();       
        
     
        switch(escolha){
            case 1:
               numeroA();
               a = sc.nextInt();
     
               numeroB();
               b = sc.nextInt();
               System.out.println(Soma(a, b));
               break;
            case 2:
               numeroA();
               a = sc.nextInt();
     
               numeroB();
               b = sc.nextInt();
               System.out.println(Subtracao(a, b));
               break;
            case 3:
               numeroA();
               a = sc.nextInt();
     
               numeroB();
               b = sc.nextInt();
               System.out.println(Multiplicacao(a, b)); 
               break;
            case 4:
               numeroA();
               a = sc.nextInt();
     
               numeroB();
               b = sc.nextInt();
               System.out.println(Divisao(a, b));
               break;
            default:
                System.out.println("MAY THE FORCE BE WITH YOU!");
                sc.close();
        }
        
     }

    }
}
