package Models;

public class Preferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao()>=9){
            System.out.println(audio.getTitulo()+" é sucesso em todos lugares!!");
        }else {
            System.out.println(audio.getTitulo()+" para escutar sozinho até que vai...");
        }
    }
}
