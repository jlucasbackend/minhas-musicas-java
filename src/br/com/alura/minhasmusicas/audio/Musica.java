package br.com.alura.minhasmusicas.audio;

import br.com.alura.minhasmusicas.playlists.Classificavel;

public class Musica extends Audio implements Classificavel {
    private String cantor;
    private String album;
    private String genero;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

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

    @Override
    public void fichaAudio() {
        super.fichaAudio();
        System.out.println("Cantor: " + cantor);
        System.out.println("Album: " + album);
        System.out.println("Gênero: " + genero);
    }

    @Override
    public int getClassificavel() {
        if (getTotalDeReproducoes() > 100000) {
            return 4;
        } else {
            return 2;
        }
    }
}
