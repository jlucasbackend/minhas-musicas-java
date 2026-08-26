package br.com.alura.minhasmusicas.audio;

public class Audio {
    private String titulo;
    private double duracaoEmMinutos;
    private int totalDeReproducoes;
    private int totalCurtidas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }


    public void curte() {
        totalCurtidas++;
    }

    public void reproduzir() {
        totalDeReproducoes++;
    }

    public void fichaAudio() {
        System.out.println("Nome: " + titulo);
        System.out.println("Duração: " + duracaoEmMinutos);
        System.out.println("Curtidas: " + totalCurtidas);
        System.out.println("Total de Reproduções: " + totalDeReproducoes);

    }

}
