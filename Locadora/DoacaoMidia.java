package Locadora;

import java.util.Random;

public class DoacaoMidia {

    // essa classe deve conter:
    // método pegarMidiaAleatoria() que devolve uma midia aleatória já criada na biblioteca

    public static Midia pegarMidiaAleatoria() {
        Midia cd1 = new Cd();
        Midia cd2 = new Cd();
        Midia cd3 = new Cd();
        Midia dvd1 = new Dvd(Midia midia, "francês", true, "português");
        Midia dvd2 = new Dvd(Midia midia, "japonês", true, "português");
        Midia dvd3 = new Dvd(Midia midia, "espanhol", false, "sem leganda");

        Random midiaAleatoria = new Random();

        int midiaEscolhida = midiaAleatoria.nextInt(5);

        switch (midiaEscolhida) {
            case 0: return cd1;

            case 1: return cd2;

            case 2: return cd3;

            case 3: return dvd1;

            case 4: return dvd2;

            default: return dvd3;
        }

            public void assistirFilme(Dvd dvd) {
            //método assisitirFilme(Dvd dvd) e chamar os dois métodos de legenda
            //Não estou conseguindo chamar os métodos de legenda (pede para transformar em static)
                Dvd.legenda(true, "português");
                Dvd.legenda(true);

        }
    }


    //Método main: O main deve pegar uma midia aleatoria e dar o play
    public static void main(String[] args) {
        Midia midiaDoacao = pegarMidiaAleatoria();

    }
}
