package com.danielrodriguez.audioplayback.modelos;

public class Podcast extends Audio{

    //Atributos de podcast

    private String presentador;
    private String descripcion;
    private String tematica;
    private int cantidadDeEpisodios;

    //Constructor

    public Podcast(String titulo, int duracion, String idioma) {
        super(titulo, duracion, idioma);
    }

    //Getters and setters

    public String getPresentador() { return presentador; }
    public void setPresentador(String presentador) { this.presentador = presentador; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getTematica() { return tematica; }
    public void setTematica(String tematica) { this.tematica = tematica; }

    public int getCantidadDeEpisodios() { return cantidadDeEpisodios; }
    public void setCantidadDeEpisodios(int cantidadDeEpisodios) { this.cantidadDeEpisodios = cantidadDeEpisodios; }
}
