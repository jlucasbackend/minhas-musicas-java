package br.com.alura.minhasmusicas.playlists;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificavel() >= 4) {
            System.out.println("Mais ouvidos!");
        } else if (classificavel.getClassificavel() >= 2) {
            System.out.println("Popular!");
        } else {
            System.out.println("Recomendado!");
        }
    }
}
