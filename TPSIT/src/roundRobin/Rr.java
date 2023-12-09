package roundRobin;

public class Rr {

    public static void main(String[] args) {
        String[] processo = new String[4];
        int[] tArrivo = new int[4];
        int[] tExe = new int[4];
        int[] tServizio = new int[4];
        double[] tAttesa = new double[4];
        double media = 0;
        int qT = 3;

        processo[0] = "P0";
        processo[1] = "P1";
        processo[2] = "P2";
        processo[3] = "P3";

        tArrivo[0] = 0;
        tArrivo[1] = 1;
        tArrivo[2] = 2;
        tArrivo[3] = 3;

        tExe[0] = 5;
        tExe[1] = 3;
        tExe[2] = 8;
        tExe[3] = 6;

        
    }
}
