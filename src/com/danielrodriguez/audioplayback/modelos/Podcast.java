package com.danielrodriguez.audioplayback.modelos;
import com.danielrodriguez.audioplayback.calculos.Clasificacion;

public class Podcast extends Audio implements Clasificacion {

    //Atributos de podcast

    private String presentador;
    private String descripcion;
    private int cantidadDeEpisodios;
    private int duracionDeEpisodiosEnMinutos;

    //Constructor

    public Podcast(String titulo, String idioma) {
        super(titulo, idioma);
    }

    //Getters and setters

    public String getPresentador() { return presentador; }
    public void setPresentador(String presentador) { this.presentador = presentador; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public int getCantidadDeEpisodios() { return cantidadDeEpisodios; }
    public void setCantidadDeEpisodios(int cantidadDeEpisodios) { this.cantidadDeEpisodios = cantidadDeEpisodios; }

    public int getDuracionDeEpisodiosEnMinutos() { return duracionDeEpisodiosEnMinutos; }
    public void setDuracionDeEpisodiosEnMinutos(int duracionDeEpisodiosEnMinutos) { this.duracionDeEpisodiosEnMinutos = duracionDeEpisodiosEnMinutos; }

    //Metodos

    @Override
    public int getClasificacion() {
        if(getTotalDeReproducciones() >= 10) {
            return 5;
        } else if (getTotalDeReproducciones() >= 7) {
            return 4;
        } else if (getTotalDeReproducciones() >= 5){
            return 3;
        } else {
            return 2;
        }
    }

    @Override
    public int getDuracionEnMinutos() {
        return duracionDeEpisodiosEnMinutos * cantidadDeEpisodios;
    }
}
