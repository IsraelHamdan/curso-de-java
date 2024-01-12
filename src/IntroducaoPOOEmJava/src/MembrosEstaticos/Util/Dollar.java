package MembrosEstaticos.Util;

public class Dollar {
    public static double dollarValue;
    public static final double IOF = (double) 6/100;

    public static double precoEmReais(double dollar) {
        return dollar * dollarValue * (1 + IOF);
    }



}
