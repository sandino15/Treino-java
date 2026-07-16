package Udemy.Java;

import java.util.Scanner;

public class treinoSwitch {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("qual foi a sua nota: " );
        int nota = scanner.nextInt();

        switch (nota){
            case 10:

            case 9:

                System.out.println("ótima nota, exelente aluno");

                break;
            case 8:
                     System.out.println("bom");

                break;
            case 7:
                    System.out.println("regular");

                break;
            default:
                    System.out.println("ruim");

        }

        System.out.println(" Digite sua nota novamente:");
        int nota2 = scanner.nextInt();
        switch (nota2){
            case 7:
                System.out.println("bilubilu");
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
        }
    }
}
