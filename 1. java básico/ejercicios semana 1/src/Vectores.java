public class Vectores {
    public static void main(String[] args) {
        double sumaTemperaturas = 0;
        double media = 0;


        int[] temperaturas = new int[7];

        temperaturas[0] = 41;
        temperaturas[1] = 39;
        temperaturas[2] = 33;
        temperaturas[3] = 38;
        temperaturas[4] = 39;
        temperaturas[5] = 29;
        temperaturas[6] = 31;

        for(int i = 0; i < temperaturas.length; i++){
            sumaTemperaturas += temperaturas[i];

        }
        System.out.println(sumaTemperaturas/ 7);

    }

}
