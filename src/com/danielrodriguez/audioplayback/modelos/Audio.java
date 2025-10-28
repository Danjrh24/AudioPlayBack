package com.danielrodriguez.audioplayback.modelos;

public class Audio {

    //Atributos de contenido de audio

    private String titulo;
    private int duracion;
    private int totalDeReproducciones;
    private int meGusta;

    //Constructor

    public Audio(String titulo, int duracion){
        this.titulo = titulo;
        this.duracion = duracion;
    }

    //Setters and getters


    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getDuracion() { return duracion; }
    public void setDuracion(int duracion) { this.duracion = duracion; }

    public int getTotalDeReproducciones() { return totalDeReproducciones; }
    public void setTotalDeReproducciones(int totalDeReproducciones) { this.totalDeReproducciones = totalDeReproducciones; }

    public int getMeGusta() { return meGusta; }
    public void setMeGusta(int meGusta) { this.meGusta = meGusta; }


    //Metodos o acciones

    public void meGusta(){
        meGusta++;
    }

    public void muestraFichaTecnica(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Duracion: " + duracion);
        System.out.println("Total de reproducciones: " + totalDeReproducciones);
        System.out.println("Me gustas: " + meGusta);
    }

//    public void reproducir(){
//
//    }

}
