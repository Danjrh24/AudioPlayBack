package com.danielrodriguez.audioplayback.modelos;
import com.danielrodriguez.audioplayback.calculos.Clasificacion;

public class Episodio {

    //Atributos de episodio

    private String nombre;
    private int numeroDeEpisodio;
    private int totalDeEstrellas;
    private int totalDeEvaluaciones;
    private Podcast podcast;

    //Constructor

    public Episodio(String nombre, int numeroDeEpisodio, int duracionEnMinutosDelEpisodio, Podcast podcast){
        this.nombre = nombre;
        this.numeroDeEpisodio = numeroDeEpisodio;
        this.podcast = podcast;
    }

    //Getters and setters

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getNumeroDeEpisodio() { return numeroDeEpisodio; }
    public void setNumeroDeEpisodio(int numeroDeEpisodio) { this.numeroDeEpisodio = numeroDeEpisodio; }

    public Podcast getPodcast() { return podcast; }
    public void setPodcast(Podcast podcast) { this.podcast = podcast; }

    //Metodos

    public void evalua(int numeroDeEstrellas){
        totalDeEstrellas += numeroDeEstrellas;
        totalDeEvaluaciones++;
    }

    public int calculaMediaDeEstrellas(){
        return totalDeEstrellas / totalDeEvaluaciones;
    }

}
