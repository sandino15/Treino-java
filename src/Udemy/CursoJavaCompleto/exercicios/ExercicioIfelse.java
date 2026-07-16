package Udemy.CursoJavaCompleto.exercicios;

import java.util.Scanner;

public class ExercicioIfelse {

    public static void main(String[] args) {

        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
        /*double num1 = -10;
        double num2 = 8;
        double num3 = 0;

        if (num1 >= 0){
            System.out.println("Número Positivo");

        } else{
            System.out.println("Número Negativo");

        }
        if (num2 >= 0){
            System.out.println("Número Positivo");

        } else{
            System.out.println("Número Negativo");

        }

        if (num3 >= 0){
            System.out.println("Número Positivo");

        } else{
            System.out.println("Número Negativo");

        }*/

        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

        /*double n = 12;
        double n2 = -27;
        double n3 = 0;

        if (n % 2==0){

            System.out.println("Número Par");
        }else {
            System.out.println("Número Impar");
        }

        if (n2 % 2==0){

            System.out.println("Número Par");
        }else {
            System.out.println("Número Impar");
        }

        if (n3 % 2==0){

            System.out.println("Número Par");
        }else {
            System.out.println("Número Impar");
        }*/

        //Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        //Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        //ordem crescente ou decrescente.

       /* double a;
        double b;

        Scanner sc = new Scanner(System.in);

        System.out.println("digite o número A: ");
        double nA = sc.nextInt();

        System.out.println("digite o número A: ");
        double nB = sc.nextInt();
        if (nA % nB == 0 || nB % nA == 0){
            System.out.println("Verdadeiro");

        }else {
            System.out.println("Falso");
        }*/

        //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        //começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

       /* Scanner sc = new Scanner(System.in);

        System.out.println("Qual o horario inicial? ");
        double hi = sc.nextInt();

        System.out.println("Qual o horario final? ");
        double hf = sc.nextInt();

        double duracao;

        if (hi < hf){
            duracao = hf - hi;

        }else {
            duracao = 24 -hi + hf;

        }
        System.out.println("O jogo durou " + duracao + " Hora(s)");*/

        //Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        //seguir, calcule e mostre o valor da conta a pagar.

   /* Scanner sc = new Scanner(System.in);

        System.out.println("vai querer qual comida: ");
        int cod = sc.nextInt();

        System.out.println("qunatos? ");
        int qtn = sc.nextInt();

        double total;
        if (cod ==1){
            total = qtn * 4.0;
        } else if (cod == 2) {
            total = qtn * 4.5;
        } else if (cod == 3) {
            total = qtn * 5.0;
        } else if (cod == 4) {
            total = qtn * 2.0;
        }else {
            total = qtn * 1.5;
        }

        System.out.println("Total: R$ " + total);*/

        //Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
        //seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
        //nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

       /* Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma valor até 100: ");
        int vt = sc.nextInt();

        if (vt <= 25){
            System.out.println("Intervalo de 0,25");

        } else if (vt <= 50) {
            System.out.println("Intervalo de 25,50");
        } else if (vt <= 75) {
            System.out.println("Intervalo de 50,75");
        }else {
            System.out.println("Intervalo de 75,100");
        }*/

        //Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
        //de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
        //ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
        //Se o ponto estiver na origem, escreva a mensagem “Origem”.
        //Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação

        Scanner sc = new Scanner(System.in);

        System.out.println("escolha o valor X: ");
        int x = sc.nextInt();

        System.out.println("Escolha o valor Y: ");
        int y = sc.nextInt();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        }
        else if (x == 0.0) {
            System.out.println("Eixo Y");
        }
        else if (y == 0.0) {
            System.out.println("Eixo X");
        }
        else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }
    }
}
