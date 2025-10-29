package com.danielrodriguez.audioplayback.modelos;
import com.danielrodriguez.audioplayback.calculos.Clasificacion;

public class Cancion extends Audio implements Clasificacion {

    //Atributos de cancion

    private String artista;
    private String genero;
    private String album;

    //Constructor

    public Cancion(String titulo, int duracion, String idioma){
        super(titulo, duracion, idioma);
    }

    //Getters and setters

    public String getArtista() { return artista; }
    public void setArtista(String artista) { this.artista = artista; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getAlbum() { return album; }
    public void setAlbum(String album) { this.album = album; }

    //Metodos

    @Override
    public int getClasificacion() {
        if (getTotalDeMeGusta() >= 10) {
            return 5;
        } else if (getTotalDeMeGusta() >= 7) {
            return 4;
        } else {
            return 3;
        }
    }
}
