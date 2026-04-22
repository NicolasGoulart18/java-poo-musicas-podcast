package Models;

public class Musica extends Audio{
    private String album;
    private String genero;
    private String cantor;
    private int totalCurtias;
    private int totalDeReproducoes=4000;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalDeReproducoes()>2000){
            return 10;
        }else if (this.getTotalDeReproducoes()<2000 && this.getTotalDeReproducoes()>1000){
            return 7;
        }else{
            return 5;
        }
    }
}
