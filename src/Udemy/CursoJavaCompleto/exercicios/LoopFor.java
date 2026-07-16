package Udemy.CursoJavaCompleto.exercicios;

import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        //Exercício 1
   /* Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
    X, se for o ;caso.*/
      /*  int x = 8;
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }*/
        //Exercício 2
        /*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
        */

        Scanner sc = new Scanner(System.in);

       /* int in =0;
        int out =0;
        System.out.println("escolha um número: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Qual o valor de X: ");
            int x = sc.nextInt();
            if (x>= 10 && x<=20){
                in += 1;

            }else {
                out +=1;
            }
        }
        System.out.println("in: " + in);
        System.out.println( "out:" + out );
        */
        //Exercício 3

        /*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
        de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
        conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
        peso 5.*/
       /* System.out.println("escolha um valor: ");
        double n = sc.nextDouble();

        for (int i = 0; i < n; i++) {
            if (n <= 10){
                System.out.println("escolha um valor: ");
                double a = sc.nextDouble();

                System.out.println("escolha um valor: ");
                double b = sc.nextDouble();

                System.out.println("escolha um valor: ");
                double c = sc.nextDouble();

                double media = (a*2.0 + b*3.0 + c*5.0) / 10;

                System.out.println(media);
            }

        }*/

        //Exercício 4
        /*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
        segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/

       /* System.out.println("escolha um valor:");
        int n = sc.nextInt();

        System.out.println("escolha um valor:");
        int n1 = sc.nextInt();

        System.out.println("escolha um valor:");
        int n2 = sc.nextInt();

        System.out.println();
        for (int i = 0; i < n; i++) {
            if (n2 == 0) {
                System.out.println("Divisão impossivel");


            } else {
                double div = n1 / n2;
                System.out.println(div);
            }
        }*/


        //Exercício
        /*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
    Lembrando que, por definição, fatorial de 0 é 1.*/



       /* System.out.println("Digite um valor:");
        int n1 = sc.nextInt();
        System.out.println("Digite um valor:");
        int n2= sc.nextInt();
        System.out.println("Digite um valor:");
        int n3= sc.nextInt();
        int f1 = n1*(n1-1)*(n1-2)*(n1-3);
        int f2 = n2*(n2-1)*(n2-2)*(n2-3);
        int f3 = n3*(n3-1)*(n3-2)*(n3-3);


        System.out.println("entrada1: " + f1);
        System.out.println("entrada2: " + f2);
        System.out.println("entrada3: " + f3);
        if (f1==0 || f2 == 0 || f3 ==0){
            System.out.println("Se o fatorial for 0,0 é igual a: " +1);
        }*/
        //Exercício 6
        // Ler um número inteiro N e calcular todos os seus divisores.
       /* System.out.println("Digite um valor:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i== 0) {
                System.out.println(i);
            }
        }*/
        //Exercício 7

        /*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
         começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
         exemplo.*/

        /*System.out.println("Digite um valor:");
        double n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);

        }
*/
        System.out.println("Digite um valor:");
        int a = sc.nextInt();
        System.out.println("Digite um valor:");
        int b = sc.nextInt();
        System.out.println("Digite um valor:");
        int c = sc.nextInt();

        int higher = max(a,b,c);
        showResult(higher);
    }
    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        }else if(y > z){
            aux = y;
        }else{
            aux = z;
        }
        return aux;
    }
    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }
}

    

