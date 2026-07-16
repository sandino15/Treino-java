package Udemy.CursoJavaCompleto.exercicios.cap9.aplicacao;

import Udemy.CursoJavaCompleto.exercicios.cap9.atributo.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.println("Numero da conta: ");
        int number = sc.nextInt();
        System.out.println("Nome da conta");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Vai aplicar o deposito inicial (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y' ){
            System.out.println("Valor do deposito inicial: ");
            double initialDeposit = sc.nextDouble();
            conta= new Conta(number,holder,initialDeposit);
        }
        else {
            conta = new Conta(number,holder);
        }
        System.out.println();
        System.out.println("Conta: ");
        System.out.println(conta);

        System.out.println("Qual o valor do deposito");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Atualização da conta: ");
        System.out.println(conta);

        System.out.println("Qual o valor do saque");
        double saque = sc.nextDouble();
        conta.saque(saque);
        System.out.println("Atualização do saque da conta: ");
        System.out.println(conta);
        sc.close();
    }
}
