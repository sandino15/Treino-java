package PooYoutube.Alunos;

public class Bolsista extends Alunos{

    private float bolsa;


    public void renovandoBolsa(){
        System.out.println("Renovar bolsa de  " + this.nome);
    }


    @Override
    public void pagarMensalidade(){
    System.out.println(this.nome + " É bolsista! pagamento facilitado");

    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
