package Udemy.CursoJavaCompleto.exercicios;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  /*
    System.out.println("escolha um número, se for 0 encerra o laço de repetição ");
    int x = sc.();
    int soma = 0;
    while (x !=0 ){
        System.out.println("escolha outro número");
        soma += x;
         x = sc.nextDouble();

    }
    System.out.println("A soma dos números foi: " + soma);
    System.out.println("Loop Encerrado");*/

       /* int x = 5;
        int y = 0;

        while (x > 2) {

            System.out.println(x);
            y = y + x;
            x = x - 1;


        }*/

        int n = sc.nextInt();
        int soma = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            soma += x;
        }
        System.out.println("valor de x: " + soma );


    }
}
