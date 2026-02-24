public class Reproductor {
    public static void main(String[]args){
        Cancion pista = new Cancion();
        pista.setDuracion(5);
        pista.setTitulo("hinmo nacional");
        
        System.out.println("Título: " + pista.getTitulo());
        System.out.println("Duración: " + pista.getDuracion() + " minutos");
    }
}
