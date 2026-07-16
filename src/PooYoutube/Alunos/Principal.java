package PooYoutube.Alunos;

public class Principal {

    public static void main(String[] args){
    //Visitante
   /* Visitante visitante = new Visitante();
    visitante.setNome("san");
    visitante.setIdade(26);
    visitante.setSexo("M");
    System.out.println(visitante.toString());*/
    //aluno
    Alunos alunos = new Alunos();
    alunos.setNome("Vany");
    alunos.setMatricula(0154430);
    alunos.setCurso("Farmácia");
    alunos.setIdade(23);
    alunos.setSexo("F");
    alunos.pagarMensalidade();
    //Bolsita
        Bolsista bolsista = new Bolsista();
        bolsista.setMatricula(1112);
        bolsista.setNome("olga");
        bolsista.setBolsa(12.5f);
        bolsista.setSexo("F");
        bolsista.pagarMensalidade();
    }
}
