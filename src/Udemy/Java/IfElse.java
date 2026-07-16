package Udemy.Java;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
   /* int opcao = 4;


    if(opcao ==1 ){
        System.out.println("cartão de crédito selecionado!");
    }else if(opcao ==2){
        System.out.println("saldo da conta!");

    }else if(opcao == 3){
        System.out.println("Descoontos indevidos!");

    }else {
        System.out.println("falar com atendente!");

    }

    }*/

        //desafio

        /*int idade = 13;
        if (idade <= 12){
            System.out.println("criança!");
        } else if (idade >12  && idade < 18) {
            System.out.println("Adolecente!");
            
        } else if (idade > 18) {
            System.out.println("Adulto!");

        }*/

        //votação sipa

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adicione o nome do aluno: ");
        String nome = scanner.next();
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();

        //média das notas

        double media = (nota1 + nota2 +nota3) / 3;

        //verificação de aprovação

        if (media >= 7){
            System.out.println("aluno " + nome + " aprovado " +" com média: "  + media);
        }else {
            System.out.println("aluno  " + nome + " foi reprovado por média baixa : " + media);
        }
        scanner.close();




    }
}