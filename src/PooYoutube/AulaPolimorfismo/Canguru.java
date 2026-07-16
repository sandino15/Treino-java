package PooYoutube.AulaPolimorfismo;

public class Canguru  extends Mamifero{


    public void locomover() {
        System.out.println("Saltando");
        super.locomover();
    }

    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }
}
