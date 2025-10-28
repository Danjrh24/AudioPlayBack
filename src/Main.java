import com.danielrodriguez.audioplayback.modelos.Cancion;

public class Main {
    public static void main(String[] args) {

        Cancion miCancion = new Cancion("120", 2, "español");
        miCancion.setArtista("Bad Bunny");
        miCancion.setAlbum("El último tour del mundo");
        miCancion.setGenero("trap");
        miCancion.muestraFichaTecnica(miCancion);
        miCancion.reproducir();
    }
}
