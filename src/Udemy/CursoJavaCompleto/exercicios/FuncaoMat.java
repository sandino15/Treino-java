package Udemy.CursoJavaCompleto.exercicios;

public class FuncaoMat {

    public static void main(String[] args){

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double b = 2;
        double a = 3;
        double c = 2;

       /* A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 "  + " = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + " Elevado a " + y + " = " + A);
        System.out.println(x + " Elevado ao quadrado = " + B);
        System.out.println( " 5 Elevado ao quadrado = " + C);

        A = Math.abs(x);
        B = Math.abs(y);

        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);*/

        double delta = Math.pow(b,2.0) - 4 * a * c;

        double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);;

        System.out.println(" Valor de Delta " + delta);
        System.out.println(" Valor de Delta " + x1);
        System.out.println(" Valor de Delta " + x2);
    }



}
