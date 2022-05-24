package gui;
import javax.swing.JTextArea;
public class productor extends Thread {
    private Contenedor contenedor;
    private final int lim;
    private final int a;
    private int xo;
    private float r;
    private  int  m;
    private JTextArea objetoTextArea;
      public productor (Contenedor c, int N, int alfa, int semilla, int valorm, JTextArea resul) {
          this.lim = N;
          this.xo = semilla;
          this.a = alfa;
          this.m = valorm;
          objetoTextArea = resul;
      contenedor = c;
      }  

    @Override
     public void run() {     
      for (int i = 0; i < lim; i++) {
           xo =  (xo*a) % m;
           contenedor.put(xo);
           r = ((float) xo)/(m-1);
            objetoTextArea.append("El valor de X"+ i +" es ==> " +Integer.toString(xo));
            objetoTextArea.append(System.getProperty("line.separator")); 
            objetoTextArea.append("El valor de r"+ i +" es ==>"+Float.toString(r));
            objetoTextArea.append(System.getProperty("line.separator")); 
           System.out.println("Productor. put: " + xo);
      
}
}
}
