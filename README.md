public interface IPlaylist{

    void agregarCancion(Cancion c);
    void eliminarCancion(String titulo);
    Cancion reproducirSiguiente();
    void vaciarLista();
    int obtenerCantidadCanciones();

}

class cnacion{

    private int duracion;
    private String titulo;

    public cancion(string titulo, int duracion){
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public string getduracion(){
        return duracion
    }
    public int gettitulo(){
        return titulo
    }
}
