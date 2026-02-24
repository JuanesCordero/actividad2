public class EstacionClimatica {
    public static void main(String[] args) {

        double[] temperaturas = new double[24];

        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = Math.random() * 40;
        }

        System.out.println("Temperatura hora [12] del medio dia: " + temperaturas[12] + "°C");

        try {
            temperaturas[24] = 25.0; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("La memoria es fija en (0 a 23).");
        }
    }
}


    

