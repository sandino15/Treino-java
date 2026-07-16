package Udemy.CursoJavaCompleto.poo;

import Udemy.CursoJavaCompleto.poo.entidades.Retangulo;

import java.util.Scanner;

public class PrincipalRetangulo {
    public static void main(String[]args) {

        Retangulo retangulo = new Retangulo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Largura");
        retangulo.largura = sc.nextDouble();

        System.out.println("Digite a altura");
        retangulo.altura = sc.nextDouble();

        System.out.println("Area = " + retangulo.area());
        System.out.println("Perimetro = " + retangulo.perimetro());
        System.out.println("Diagonal = " + retangulo.diagonal());

    }
}
