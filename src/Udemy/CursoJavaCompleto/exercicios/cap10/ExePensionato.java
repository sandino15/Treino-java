package Udemy.CursoJavaCompleto.exercicios.cap10;

import java.util.Scanner;

public class ExePensionato {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("quantos alunos ?");
        int n = sc.nextInt();

        String [] email = new String[n];
        String [] nome = new String[n];
        int [] quartos = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Registro de quarto alugado " );
            System.out.println(i+ 1);

            System.out.println("Qual o seu nome: ");
            nome [i]  = sc.next();

            System.out.println("Qual o seu email: ");
            email [i]  = sc.next();

            System.out.println("Qual o seu quarto: ");
            quartos [i]  = sc.nextInt();

            System.out.println("Você escolheu o quarto: " + quartos[i]);
        }

        System.out.println("Registros");

        System.out.println(quartos[0] + ":" + nome[0] + "," + email[0]);
        System.out.println(quartos[1] + ":" + nome[1] + "," + email[1]);
        System.out.println(quartos[2] + ":" + nome[3] + "," + email[2]);

    }
}
