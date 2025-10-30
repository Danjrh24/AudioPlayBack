package com.danielrodriguez.audioplayback.modelos;
import com.danielrodriguez.audioplayback.calculos.Clasificacion;
import com.danielrodriguez.audioplayback.calculos.DuracionTotalEnMinutos;
import com.danielrodriguez.audioplayback.calculos.FiltroDeRecomendacion;

import java.util.Scanner;

public class Audio {

    //Atributos de contenido de audio

    private String titulo;
    private int duracionEnMinutos;
    private int totalDeReproducciones;
    private int totalDeMeGusta;
    private String idioma;
    int userChoice;
    Scanner inputUser = new Scanner(System.in);

    //Objetos

    FiltroDeRecomendacion filtroDeRecomendacion = new FiltroDeRecomendacion();

    //Constructor

    public Audio(String titulo, String idioma){
        this.titulo = titulo;
        this.idioma = idioma;
    }

    //Getters and setters


    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getDuracionEnMinutos() { return duracionEnMinutos; }
    public void setDuracionEnMinutos(int duracionEnMinutos) { this.duracionEnMinutos = duracionEnMinutos; }

    public int getTotalDeReproducciones() { return totalDeReproducciones; }
    public void setTotalDeReproducciones(int totalDeReproducciones) { this.totalDeReproducciones = totalDeReproducciones; }

    public int getTotalDeMeGusta() { return totalDeMeGusta; }
    public void setTotalDeMeGusta(int totalDeMeGusta) { this.totalDeMeGusta = totalDeMeGusta; }

    public String getIdioma() { return idioma; }
    public void setIdioma(String idioma) { this.idioma = idioma; }

    //Metodos o acciones

    public void meGusta(){
        totalDeMeGusta++;
    }

    public void muestraFichaTecnica(Audio audio){
        System.out.println("Titulo: " + titulo);
        if(audio.getClass().equals(Cancion.class)){
            System.out.println("Artista: " + ((Cancion) audio).getArtista());
            System.out.println("Género: " + ((Cancion) audio).getGenero());
            System.out.println("Album: " + ((Cancion) audio).getAlbum());
        } else if (audio.getClass().equals(Podcast.class)){
            System.out.println("Presentador: " + ((Podcast) audio).getPresentador());
            System.out.println("Descripcion: " + ((Podcast) audio).getDescripcion());
            System.out.println("Cantidad de episodios: " + ((Podcast) audio).getCantidadDeEpisodios());
        }
        System.out.println("Duracion total en minutos: " + audio.getDuracionEnMinutos());
        System.out.println("Valoracion: " + filtroDeRecomendacion.filtra((Clasificacion) audio));
        System.out.println("Total de reproducciones: " + totalDeReproducciones);
        System.out.println("Me gustas: " + totalDeMeGusta);
    }



//    public void reproducir(){
//        System.out.println("▶️ Reproduciendo " + titulo + "...");
//        duracionEnMinutos = duracionEnMinutos * 60;
//            for (int i = 1; i <= duracionEnMinutos; i++) {
//                System.out.print("\r⏱️ Segundo " + i + "...");
//                try {
//                    Thread.sleep(1000); // Pausa de 1 segundo
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println("⏹️ Reproducción finalizada.");
//    }
}

