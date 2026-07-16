package Udemy.CursoJavaCompleto.exercicios;

public class ExercicioMat {

    //Exercício 1
    //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
    //mensagem explicativa, conforme exemplos.

    public static void main(String []args){
      /*  int n1 = 10;
       int n2 = 30;
      int n3 = -30;
        int n4 = 10;
       int n5 = 0;
       int n6 = 0;

       int soma1 = n1 + n2;
       int soma2 = n3 + n4;
       int soma3 = n5 + n6;
       System.out.println("Saída1: " + soma1 + " Soma2: " + soma2 + " Soma3: " + soma3);*/

        //Exercício 2
        //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        //casas decimais conforme exemplos.
        //Fórmula da área: area = π . raio2
        //Considere o valor de π = 3.14159

       /* double pi = 3.14;
        double entrada1 = 2.00;
        double entrada2 = 100.64;
        double entrada3 = 150.00;
        double el1 = Math.pow(entrada1,2);
        double el2 = Math.pow(entrada2,2);
        double el3 = Math.pow(entrada3,2);
        double vl1 = el1 * pi;
        double vl2 = el2 * pi;
        double vl3 = el3 * pi;


        System.out.println("Valor 1: "+ vl1 + " Valor 2: " + vl2 + " Valor 3: " + vl3 );*/

        //Exercício 3
        //Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        //de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        /*int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;


        Scanner sc = new Scanner(System.in);

       *//* System.out.println("escreva o números da entrada A: ");
        int vl1 = sc.nextInt();

        System.out.println("escreva o números da entrada B: ");
        int vl2 = sc.nextInt();

        System.out.println("escreva o números da entrada C: ");
        int vl3 = sc.nextInt();

        System.out.println("escreva o números da entrada D: ");
        int vl4 = sc.nextInt();

        int cal = vl1 * vl2 - vl3 *vl4;

        System.out.println("Resultado da diferença: " + cal);*//*

        System.out.println("escreva o números da entrada A: ");
        int vlr1 = sc.nextInt();

        System.out.println("escreva o números da entrada B: ");
        int vlr2 = sc.nextInt();

        System.out.println("escreva o números da entrada C: ");
        int vlr3 = sc.nextInt();

        System.out.println("escreva o números da entrada D: ");
        int vlr4 = sc.nextInt();

        int cal2 = vlr1 * vlr2 - vlr3 *vlr4;

        System.out.println("Resultado da diferença: " + cal2);*/

        //Exercício 4
        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        //decimais.

        int fun1 = 25;
        int hr1 = 100;
        double hrt1 = 5.50;
        double sal1 = hr1 * hrt1;

        int fun2 = 1;
        int hr2 = 200;
        double hrt2 = 20.50;
        double sal2 = hr2 * hrt2;

        int fun3 = 6;
        int hr3 = 145;
        double hrt3 = 15.55;
        double sal3 = hr3 * hrt3;

        System.out.println("Funcionario " + fun1 +" Salario " + sal1);
        System.out.println("Funcionario " + fun2 +" Salario "+ sal2);
        System.out.println("Funcionario " + fun3 +" Salario "+ sal3);


    }
}
