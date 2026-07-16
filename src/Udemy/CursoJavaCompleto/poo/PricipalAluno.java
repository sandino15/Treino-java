package Udemy.CursoJavaCompleto.poo;

import Udemy.CursoJavaCompleto.poo.entidades.Estudante;

import java.util.Scanner;

public class PricipalAluno {
    public static void main(String[]args){
        Estudante estudante = new Estudante();
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite seu nome: ");
        estudante.nome = sc.nextLine();
        System.out.println("Nota primeiro trimestre");
        estudante.tri1 = sc.nextInt();
        System.out.println("Nota segundo trimestre");
        estudante.tri2 = sc.nextInt();
        System.out.println("Nota terceiro trimestre");
        estudante.tri3 = sc.nextInt();


        System.out.println("Nota final " + estudante.notaFinal());

        if (estudante.notaFinal() < 60){
            System.out.println("FAILED");
            System.out.println("MISSING POINT " + estudante.misspoint());
        }else {
            System.out.println("PASS");
        }
    }
}
