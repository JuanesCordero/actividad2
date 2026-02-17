public interface Iplaylist{
    void agregarCancion(Cancion c);
    void eliminarCancion(String titulo);
    Cancion reproducirSiguiente();
    void vaciarLista();
    int obtenerCantidadCanciones();
}
