package com.danielrodriguez.audioplayback.calculos;

public class FiltroDeRecomendacion {

    public String filtra(Clasificacion clasificacion){
        if(clasificacion.getClasificacion() >= 5 ){
            return "Muy bien valorado en el momento";
        } else if (clasificacion.getClasificacion() >= 3) {
            return "Bien valorado en el momento";
        } else {
            return "Agregalo a tu lista de espera";
        }
    }

}
