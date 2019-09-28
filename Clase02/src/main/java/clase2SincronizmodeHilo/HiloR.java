package clase2SincronizmodeHilo;

import ar.com.eduit.curso.java.advanced.clase01.*;

public class HiloR implements Runnable {

    //crear atributo 
    private String nombre;
    private int time = 500;

    //constructor que recibe ese atributo
    public HiloR(String nombre) {
        this.nombre = nombre;
    }

    public HiloR(String nombre, int time) {
        this.nombre = nombre;
        this.time = time;
    }

    //el metodo run es un metodo sobre escrito
    @Override
    public void run() {
        //que vaya de 1 a 10
        for (int a = 1; a <= 10; a++) {
            System.out.println(nombre + " " + a);
            Thread.yield();
            // los metodos nativos no tienen codigo, estan escritos en lenguaje C
                    //yield le da prioridad a otro hilo, ya no sirve hoy en dìa
                    
            try {
                Thread.sleep(time);
                //numero inside milmilesimas
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
