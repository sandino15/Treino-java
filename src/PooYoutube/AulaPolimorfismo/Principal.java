package PooYoutube.AulaPolimorfismo;

public class Principal {


    public static void main(String[]args){

        //Animal animal = new Animal();
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        GoldFish goldfish = new GoldFish();
        Arara arara = new Arara();
        Cachorro2 cachorro2 = new Cachorro2();
        Aguia aguia = new Aguia();
        canguru.locomover();
        cachorro.emitirSom();
        cobra.alimentar();
        cobra.emitirSom();
        cobra.alimentar();

       cachorro2.reagir("Olá");
        cachorro2.reagir(19,00);
        cachorro2.reagir(false);
        cachorro2.reagir(4,9.5f);
        cachorro2.emitirSom();






    }
}
