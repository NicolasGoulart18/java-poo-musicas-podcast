package Models;

public class Podcast extends Audio {

    private String aprensentador;
    private String descricao;
    private int totalCurtidas=1000;

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }

    public String getAprensentador() {
        return aprensentador;
    }

    public void setAprensentador(String aprensentador) {
        this.aprensentador = aprensentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas()>500){
            return 10;
        }else{
            return 8;
        }
    }
}
