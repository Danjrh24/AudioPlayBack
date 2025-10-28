package com.danielrodriguez.audioplayback.modelos;

import java.util.Scanner;

public class Audio {

    //Atributos de contenido de audio

    private String titulo;
    private int duracionEnMinutos;
    private int totalDeReproducciones;
    private int meGusta;
    private String idioma;
    int userChoice;
    Scanner inputUser = new Scanner(System.in);


    //Constructor

    public Audio(String titulo, int duracion, String idioma){
        this.titulo = titulo;
        this.duracionEnMinutos = duracion;
        this.idioma = idioma;
    }

    //Getters and setters


    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getDuracionEnMinutos() { return duracionEnMinutos; }
    public void setDuracionEnMinutos(int duracionEnMinutos) { this.duracionEnMinutos = duracionEnMinutos; }

    public int getTotalDeReproducciones() { return totalDeReproducciones; }
    public void setTotalDeReproducciones(int totalDeReproducciones) { this.totalDeReproducciones = totalDeReproducciones; }

    public int getMeGusta() { return meGusta; }
    public void setMeGusta(int meGusta) { this.meGusta = meGusta; }

    public String getIdioma() { return idioma; }
    public void setIdioma(String idioma) { this.idioma = idioma; }

    //Metodos o acciones

    public void meGusta(){
        meGusta++;
    }

    public void muestraFichaTecnica(Audio audio){
        System.out.println("Titulo: " + titulo);
        if(audio.getClass().equals(Cancion.class)){
            System.out.println("Artista: " + ((Cancion) audio).getArtista());
            System.out.println("Género: " + ((Cancion) audio).getGenero());
            System.out.println("Album: " + ((Cancion) audio).getAlbum());
        }
        System.out.println("Duracion: " + duracionEnMinutos);
        System.out.println("Total de reproducciones: " + totalDeReproducciones);
        System.out.println("Me gustas: " + meGusta);
    }

    public void reproducir(){
        System.out.println("▶️ Reproduciendo " + titulo + "...");
        duracionEnMinutos = duracionEnMinutos * 60;
            for (int i = 1; i <= duracionEnMinutos; i++) {
                System.out.print("\r⏱️ Segundo " + i + "...");
                try {
                    Thread.sleep(1000); // Pausa de 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("⏹️ Reproducción finalizada.");
    }
}

