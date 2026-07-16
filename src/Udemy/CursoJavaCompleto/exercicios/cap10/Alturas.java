package Udemy.CursoJavaCompleto.exercicios.cap10;

import java.util.Scanner;

public class Alturas {

    public static void main(String []args){

        Scanner sc = new Scanner (System.in);

        System.out.println("quantas pessoas serão: ");
        int n = sc.nextInt();

        int [] idade = new int[n];
        String [] nome = new String[n];
        double [] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + " pessoa");

            System.out.println("qual o seu nome?: ");
            nome[i] =sc.next();

            System.out.println("qual a sua idade?: ");
            idade [i] =sc.nextInt();

            System.out.println("qual a sua altura?: ");
            altura[i] =sc.nextDouble();
        }

        System.out.println("Mostrar altura das pessoas: ");
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + altura[i];
        }
        double mediaAlturas = soma / n;
        System.out.println(mediaAlturas);

        System.out.println("Porcentagem da pessoas com menos de 16 anos: ");
        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (idade [i] < 16){
                cont = cont + 1;
            }
        }
        double percent = cont * 100.0 / n;
        System.out.println("Pessoas com menos de 16 anos: " + percent + "%");
        for (int i=0; i< n; i++){
            if (idade[i]< 16){
                System.out.println(nome[i]);
            }
        }
    }
}
