package br.com.alura.minhasmusicas.playlists;

import br.com.alura.minhasmusicas.audio.Audio;

public class Playlist {
    private int quantidadeMusicas;
    private double duracaoTotal;


    public int getQuantidadeMusicas() {
        return quantidadeMusicas;
    }

    public double getDuracaoTotal() {
        return duracaoTotal;
    }

    public void adicionarFaixa(Audio musicaAdicionada) {
        if (musicaAdicionada.getTotalCurtidas() > 0) {
            inclui(musicaAdicionada);
            System.out.println("ADICIONADA A SUA PLAYLIST!");
        } else {
            System.out.println("A música não possui curtidas suficientes.");
        }
    }

    public void inclui(Audio audio) {
        duracaoTotal += audio.getDuracaoEmMinutos();
        quantidadeMusicas++;
    }
}
