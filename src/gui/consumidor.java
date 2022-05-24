package gui;
public class consumidor extends Thread {
    private Contenedor contenedor;
    private final int lim;
public consumidor (Contenedor c, int N) {
        this.lim = N;
        contenedor= c;
}
    @Override
     public void run() {
         int value = 0;
           for (int i = 0; i < lim; i++) {
            value = contenedor.get();
             System.out.println("Consumidor. get: " + value);
}
}
    }
    

