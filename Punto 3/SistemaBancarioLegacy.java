import java.util.Vector;
import java.util.ArrayList;

public class SistemaBancarioLegacy {

    public static void main(String[] args) {

        Vector<String> logTransacciones = new Vector<>();

        logTransacciones.add("Transferencia de $500 realizada.");
        logTransacciones.add("Depósito de $1200.");
        logTransacciones.add("Retiro de $300.");
        logTransacciones.add("Pago de servicios $150 .");
        logTransacciones.add("Consulta de saldo.");

        System.out.println("REGISTRO");
        for (String log : logTransacciones) {
            System.out.println(log);
        }
    }
         public static void compararRendimiento() {

        int cantidad = 1_000_000;

        // 🔹 Medición con Vector
        Vector<Integer> vector = new Vector<>();
        long inicioVector = System.currentTimeMillis();

        for (int i = 0; i < cantidad; i++) {
            vector.add(i);
        }

        long finVector = System.currentTimeMillis();
        long tiempoVector = finVector - inicioVector;

        // 🔹 Medición con ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        long inicioArray = System.currentTimeMillis();

        for (int i = 0; i < cantidad; i++) {
            arrayList.add(i);
        }

        long finArray = System.currentTimeMillis();
        long tiempoArray = finArray - inicioArray;

        System.out.println("\nCOMPARACIÓN");
        System.out.println("Tiempo Vector: " + tiempoVector + " ms");
        System.out.println("Tiempo ArrayList: " + tiempoArray + " ms");
    }
}