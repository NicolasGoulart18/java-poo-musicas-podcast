package Models;

public class Audio {
    private String titulo;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir(){
        this.curtidas++;
    }

    public void TotalDeReproducoes(){
        this.totalDeReproducoes++;
    }



}
