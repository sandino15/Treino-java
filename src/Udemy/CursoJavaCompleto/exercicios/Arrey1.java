package Udemy.CursoJavaCompleto.exercicios;

import java.util.Scanner;

public class Arrey1 {
    public static  void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas são? : ");
        int n = sc.nextInt();

        double [] vect =new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Qual a sua altura : ");
            vect [i] = sc.nextDouble();
        }
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
        soma += vect[i];
        }
        double media =soma / n;
        System.out.println("Média das alturas " + media);
    }
}
