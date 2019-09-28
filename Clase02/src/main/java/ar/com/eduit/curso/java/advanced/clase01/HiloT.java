package ar.com.eduit.curso.java.advanced.clase01;
public class HiloT extends Thread {
    private String nombre;
    public HiloT(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void run(){
        //Este método puede ejecutarse en un nuevo thread
        for(int a=1;a<=10;a++){
            System.out.println(nombre+" "+a);
            try {
                Thread.sleep(1000);
            } catch (Exception e) { e.printStackTrace(); }
        }
    }
}