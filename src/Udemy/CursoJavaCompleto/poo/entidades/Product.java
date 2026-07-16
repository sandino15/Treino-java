package Udemy.CursoJavaCompleto.poo.entidades;

public class Product {
    private String nome;
    private double price;
    private int quantity;

    public Product(String nome, double price, int quantity) {
        this.nome = nome;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double totalValueInStock() {

        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;

    }

    public void removerProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Product data: " + nome + " , " + "$ " + price + ", units " + quantity + " Total: " + totalValueInStock();
    }
}
