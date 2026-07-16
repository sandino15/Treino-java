package Udemy.CursoJavaCompleto.poo;

import Udemy.CursoJavaCompleto.poo.entidades.Funcionario;

import java.util.Scanner;

public class PrincipalFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.println("Sálario bruto: ");
        funcionario.salario = sc.nextDouble();
        System.out.println("imposto: ");
        funcionario.imposto = sc.nextDouble();

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Sálario Bruto: " + funcionario.salario);
        System.out.println("imposto: " + funcionario.imposto);
        System.out.println(funcionario);

        System.out.println("porcentual do salario: ");
        double porcentagem = sc.nextDouble();
        funcionario.increaseSalary(porcentagem);
        System.out.println(funcionario);


    }
}
