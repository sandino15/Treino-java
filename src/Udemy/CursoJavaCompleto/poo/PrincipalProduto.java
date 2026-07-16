package Udemy.CursoJavaCompleto.poo;

import Udemy.CursoJavaCompleto.poo.entidades.Product;

import java.util.Scanner;

public class PrincipalProduto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data");
        System.out.println("nome: ");
        String name = sc.nextLine();
        System.out.println("Preço: ");
        double price = sc.nextDouble();
        System.out.println("Qunatidade: ");
        int quantity = sc.nextInt();

        product.setNome("Computer");
        System.out.println("");

        System.out.println(product);
        System.out.println();
        System.out.println("Enter the Number of products to be added in stock: ");
         quantity = sc.nextInt();

        product.addProducts(quantity);
        System.out.println("Update data: " + product);
        System.out.println();
        System.out.println("Enter the Number of products to be removed in stock: ");
        quantity = sc.nextInt();

        product.removerProducts(quantity);
        System.out.println("update: " + product);
    }
}
