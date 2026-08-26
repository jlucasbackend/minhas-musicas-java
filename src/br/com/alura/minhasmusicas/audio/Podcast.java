package br.com.alura.minhasmusicas.audio;

import br.com.alura.minhasmusicas.playlists.Classificavel;

public class Podcast extends Audio implements Classificavel {
    private String apresentador;
    private String descricao;


    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void fichaAudio() {
        super.fichaAudio();
        System.out.println("Apresentador: " + apresentador);
        System.out.println("Descrição: " + descricao);
    }

    @Override
    public int getClassificavel() {
        if (getTotalDeReproducoes() >= 20000) {
            return 4;
        } else {
            return 2;
        }
    }
}
