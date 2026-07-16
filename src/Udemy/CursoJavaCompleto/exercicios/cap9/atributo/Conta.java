package Udemy.CursoJavaCompleto.exercicios.cap9.atributo;

public class Conta {
   private int numero;
   private String nome;
   private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void deposito (double salario ){
        saldo += salario;
    }

    public void saque (double salario){
        saldo -= salario + 5.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public Conta(int numero, String nome, double depositoInicial) {
        this.numero = numero;
        this.nome = nome;
        deposito(depositoInicial);


    }

    @Override
    public String toString() {
        return "Conta: " +  numero +
                ", nome: " + nome +
                ", saldo: " + saldo ;
    }
}
