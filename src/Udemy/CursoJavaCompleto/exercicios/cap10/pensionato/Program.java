package Udemy.CursoJavaCompleto.exercicios.cap10.pensionato;

import java.util.Scanner;

public class Program {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        Rent[] vect = new Rent[10];

        System.out.println("qual quarto você vai escolher? ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.println("Pessoa # " + i + ":");
            System.out.println("nome");
            String nome = sc.next();
            System.out.println("Email");
            String email = sc.next();
            System.out.println("Quarto: ");
            int quarto = sc.nextInt();

            vect [quarto] = new Rent(nome,email);
        }
        System.out.println();
        System.out.println("Quartos ocupados");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null){

                System.out.println(i + ":" +vect[i]);
            }
        }
    }
}
