package Principal;

import Models.Musica;
import Models.Podcast;
import Models.Preferidas;

public class Main {
    public static void main(String[] args) {
        Musica musica= new Musica();
        musica.setTitulo("Creep");
        musica.setCantor("Thom Yorke");
        for (int i =0; i<6000; i++){
            musica.TotalDeReproducoes();
        }

        for(int i=0;i<50;i++){
            musica.curtir();
        }

        Podcast podcast= new Podcast();
        podcast.setAprensentador("Igor 3k");
        podcast.setTitulo("IA com Fabio Akita!");

        for (int i = 0; i < 5000 ; i++) {

            podcast.TotalDeReproducoes();

        }

        for (int i = 0; i <10000; i++) {
            podcast.curtir();
        }

        Preferidas preferidas= new Preferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);


    }

}
