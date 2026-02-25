import java.util.Vector;
import java.util.ArrayList;

public class SistemaBancarioLegacy {

    public static void main(String[] args) {

        Vector<String> logTransacciones = new Vector<>();

        logTransacciones.add("Transferencia de $500 realizada.");
        logTransacciones.add("Depósito de $1200 realizado.");
        logTransacciones.add("Retiro de $300 realizado.");
        logTransacciones.add("Pago de servicios $150 realizado.");
        logTransacciones.add("Consulta de saldo realizada.");

        System.out.println("REGISTRO");
        for (String log : logTransacciones) {
            System.out.println(log);
        }

    }
}