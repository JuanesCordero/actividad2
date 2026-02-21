public class Cancion{
    private String titulo;
    private int duracion;

    /** titulo de la cancion
     * duracion de la cancion en minutos
      */
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setDuracion(int duracion){
        this.duracion = duracion;
    }

    /** retorna titulo de la cancion  */
    public String getTitulo(){
        return titulo;
    }

    /** retorna duracion de la cancion  */
    public int getDuracion(){
        return duracion;
    }

}