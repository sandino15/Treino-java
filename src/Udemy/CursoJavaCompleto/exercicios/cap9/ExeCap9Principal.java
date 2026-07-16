package Udemy.CursoJavaCompleto.exercicios.cap9;

import java.util.Scanner;

public class ExeCap9Principal {
    public static void main(String[]args){

            Scanner sc = new Scanner(System.in);

            System.out.println("Número da conta: ");
            final int numConta = sc.nextInt();

            System.out.println("Qual o seu nome: ");
            String nome = sc.next();

            System.out.println("Deposito inicial (S/N)?: ");
            String depositoInicial = sc.next();

            System.out.println("Deposito inicial: ");
            double deposito = sc.nextDouble();
            if (depositoInicial == "S"){
                System.out.println("Conta ," + numConta+ " nome ,"  + nome + " Deposito inicial: " + deposito);
            }




    }
}
