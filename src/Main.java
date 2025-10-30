import com.danielrodriguez.audioplayback.modelos.Cancion;
import com.danielrodriguez.audioplayback.modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        Cancion miCancion = new Cancion("120", "español");
        miCancion.setArtista("Bad Bunny");
        miCancion.setAlbum("El último tour del mundo");
        miCancion.setGenero("trap");
        miCancion.muestraFichaTecnica(miCancion);
        System.out.println("\n**********************************\n");
        Podcast miPodcast = new Podcast("The Wild Proyect", "Español");
        miPodcast.setPresentador("Jordi Wild");
        miPodcast.setDescripcion("""
                CADA MARTES Y JUEVES NUEVOS EPISODIOS
                Bienvenidos a THE WILD PROJECT, el podcast de Jordi Wild.
                Charlas con los invitados más interesantes, actualidad, ciencia, deportes, filosofía, psicología,
                misterio, debates y tertulias... y muchísimo más.""");
        miPodcast.setCantidadDeEpisodios(346);
        miPodcast.setDuracionDeEpisodiosEnMinutos(3*60);
        miPodcast.muestraFichaTecnica(miPodcast);
    }

}
