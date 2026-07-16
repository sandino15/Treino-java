package Udemy.CursoJavaCompleto.poo.entidades;

public class Funcionario {
    public String nome;
    public double salario;
    public double imposto
            ;
    public double netsalry() {

       return salario - imposto;
    }

    public void increaseSalary(double porcentagem) {

        salario += salario * porcentagem / 100.0;

    }

    @Override
    public String toString() {
        return "nome do " +
                "Funcionario " + nome + " $ " + netsalry();
    }
}
