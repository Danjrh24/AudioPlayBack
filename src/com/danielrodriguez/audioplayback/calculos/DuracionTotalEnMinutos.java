package com.danielrodriguez.audioplayback.calculos;

import com.danielrodriguez.audioplayback.modelos.Audio;

public class DuracionTotalEnMinutos {

    private int duracionTotal;

    //Agrega la duracion total en minutos de las instancias de tipo audio

    public void calculaDuracionTotal(Audio audio){
        duracionTotal += audio.getDuracionEnMinutos();
    }

    //Retorna la duracion en minutos total

    public int getDuracionTotal(){
        return duracionTotal;
    }


}
