package com.danielrodriguez.audioplayback.modelos;
import com.danielrodriguez.audioplayback.calculos.Clasificacion;

public class Podcast extends Audio implements Clasificacion {

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

    //Metodos

    @Override
    public int getClasificacion() {
        if(getTotalDeReproducciones() >= 10) {
            return 5;
        } else if(getTotalDeReproducciones() >= 7) {
            return 4;
        } else {
            return 3;
        }
    }
}
