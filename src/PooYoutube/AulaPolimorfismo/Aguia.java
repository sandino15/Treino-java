package PooYoutube.AulaPolimorfismo;

public class  Aguia extends Animal{

    @Override
    public void locomover() {
        System.out.println("voando alto");
    }

    @Override
    public void alimentar() {
        System.out.println("peixes e animais terrestres");
    }

    @Override
    public void emitirSom() {
        System.out.println("uauauauaua!!!");
    }
}
