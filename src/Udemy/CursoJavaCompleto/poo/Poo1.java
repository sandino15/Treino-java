package Udemy.CursoJavaCompleto.poo;

import Udemy.CursoJavaCompleto.poo.entidades.Triangulo;

import java.util.Scanner;

public class Poo1 {

    public static void main(String[] args) {

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        x.a = sc.nextDouble();
        System.out.println("Digite o valor de X: ");
        x.b = sc.nextDouble();
        System.out.println("Digite o valor de X: ");
        x.c = sc.nextDouble();
        System.out.println("Digite o valor de Y: ");
        y.a = sc.nextDouble();
        System.out.println("Digite o valor de Y: ");
        y.b = sc.nextDouble();
        System.out.println("Digite o valor de Y: ");
        y.c = sc.nextDouble();

       double areaX = x.area();
        double areaY = y.area();
        System.out.println("triagulo X " + areaX);
        System.out.println("triagulo Y " + areaY);
        if (areaX > areaY) {
            System.out.println("A maior largura é de: X ");
        } else {
            System.out.println("A maior largura é de Y");
        }
    }
}
