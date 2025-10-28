package com.danielrodriguez.audioplayback.modelos;

public class Cancion extends Audio{

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
}
