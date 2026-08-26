package br.com.alura.minhasmusicas;

import br.com.alura.minhasmusicas.audio.Musica;
import br.com.alura.minhasmusicas.audio.Podcast;
import br.com.alura.minhasmusicas.playlists.FiltroRecomendacao;
import br.com.alura.minhasmusicas.playlists.Playlist;

public class Principal {
    static void main() {
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        Playlist playlist = new Playlist();
        Musica osom = new Musica();

        osom.setTitulo("O Som");
        osom.setCantor("Matuê");
        osom.setDuracaoEmMinutos(5.12);
        osom.setAlbum("333");
        osom.setGenero("Trap");
        osom.curte();
        osom.reproduzir();
        osom.fichaAudio();
        filtro.filtra(osom);
        playlist.adicionarFaixa(osom);
        System.out.println();

        Musica wayOut = new Musica();

        wayOut.setTitulo("Way Out");
        wayOut.setCantor("Stray Kids");
        wayOut.setDuracaoEmMinutos(2.54);
        wayOut.setAlbum("This & That");
        wayOut.setGenero("K-Pop");
        wayOut.reproduzir();
        wayOut.fichaAudio();
        filtro.filtra(wayOut);
        playlist.adicionarFaixa(wayOut);
        System.out.println();

        Podcast flowGames = new Podcast();

        flowGames.setTitulo("Flow games");
        flowGames.setApresentador("Davy Jones");
        flowGames.setDescricao("Discussões e notícias sobre os principais lançamentos do mundo dos games!");
        flowGames.setDuracaoEmMinutos(180);
        flowGames.curte();
        flowGames.reproduzir();
        flowGames.fichaAudio();
        filtro.filtra(flowGames);
        playlist.inclui(osom);
        playlist.inclui(wayOut);
        playlist.inclui(flowGames);
        System.out.println(playlist.getDuracaoTotal());


    }
}
