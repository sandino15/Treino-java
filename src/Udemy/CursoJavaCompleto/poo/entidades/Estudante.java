package Udemy.CursoJavaCompleto.poo.entidades;

public class Estudante {
    public String nome;
    public int tri1;
    public int tri2;
    public int tri3;

    public  int notaFinal(){
        return tri1 + tri2 + tri3;
    }

    public int misspoint(){
        if (notaFinal() <60){
        return 60 - notaFinal();
        }else {
            return 0;
        }
    }

}
