package PooYoutube.AulaPolimorfismo;

public class Cobra extends Reptil{

    @Override
    public void locomover() {

    }

    @Override
    public void emitirSom() {
        super.emitirSom();
    }
    public void alimentar(){
        System.out.println("se alimenta de ovos");
    }
}
