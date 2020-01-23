package edu.eci.arsw.math;

public class PiDigitsFactory extends Thread {

    private int digitoInicial;
    private int numeroDigitos;
    private byte[] digitosGlobales;
    private int start;

    public PiDigitsFactory(int start,int digitoInicial, int numeroDigitos, byte[] digitosGlobales){
        this.digitoInicial = digitoInicial;
        this.numeroDigitos = numeroDigitos;
        this.digitosGlobales = digitosGlobales;
        this.start = start;

    }
    @Override
    public void run(){
        byte[] digitosGenerados = PiDigits.getDigits(digitoInicial,numeroDigitos);
        for(int i=digitoInicial,j=0;i<digitoInicial+numeroDigitos;i++,j++){
            digitosGlobales[i-start] = digitosGenerados[j];
        }


    }
}
