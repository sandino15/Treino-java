package Udemy.Java;

public class OperadoresRelacionadosLogicos {

    public static void main(String[]args){
    // operadores relacionais.
       /* boolean resultado;
        int n1 = 10;
        int n2 = 5;
        int idade = 16;
        resultado = idade >18;

    System.out.println(resultado); */

   //operadores logicos.
        boolean resultado;
        int n1 = 10;
        int n2 = 5;
        int idade = 20;
        int totalCompra = 100;
        //resultado = idade>=18 && idade<=40;

        resultado = idade >= 40 || totalCompra >=100 ;

        System.out.println(resultado);

    }
}
