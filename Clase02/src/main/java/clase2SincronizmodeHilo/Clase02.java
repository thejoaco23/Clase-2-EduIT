package clase2SincronizmodeHilo;

public class Clase02 {

    public static void main(String[] args) {
        //crear objetos de hilor
        HiloR hiloR1 = new HiloR("hiloR1", 1000);
        HiloR hiloR2 = new HiloR("hiloR2");
        HiloR hiloR3 = new HiloR("hiloR3");
        HiloR hiloR4 = new HiloR("hiloR4", 300);
        //como son runneables necesito crear el constructor de Thread y luego startear.

        Thread hiloT1 = new Thread(hiloR1);
        Thread hiloT2 = new Thread(hiloR2);
        Thread hiloT3 = new Thread(hiloR3);
        Thread hiloT4 = new Thread(hiloR4);

        //Priotities propiedades hilo
        //buena idea poner no numeros xq nos vamos a olvidaer
        //Max = maxima norm = 5 min= 0 por defecto en norm
        hiloT4.setPriority(Thread.MAX_PRIORITY);
        hiloT1.setPriority(Thread.MIN_PRIORITY);

        System.out.println(hiloT1.isAlive());

        System.out.println(hiloT1.getState());

        /*hiloT1.start();
    hiloT2.start();
    hiloT3.start();
   hiloT4.start();*/
        //bloquaer esto para que se imprima al final de todo
        try {
            //metodo join
            //el hilo 1 se joinea, el hilo principal se queda detenido hasta que temrine T1
            //hasta q no termine el T1 no arranca ninguno
            hiloT1.start();
            //hiloT1.join();
            hiloT3.start();
            //hiloT3.start();
            hiloT4.start();
            //hiloT4.start();

            hiloT1.join();
            hiloT2.join();
            hiloT3.join();
            hiloT4.join();
            //el programa espera a q temrinen los 4 hilos 
// estados de vida del  hilo, muerte natural y muerte por asesinato
            //   Thread.sleep(11000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(hiloT1.getState());
        System.out.println("-- Se termino BBY --");
        System.out.println(hiloT1.isAlive());
//_ALT + SHItf + F para el formato
        // cuando es new el alive es falso, solo cuando corre is true
    }
}
