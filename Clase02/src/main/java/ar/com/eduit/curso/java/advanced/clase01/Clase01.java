package ar.com.eduit.curso.java.advanced.clase01;
public class Clase01 {
    public static void main(String[] args) {
        /*
        Curso: Java Advanced 15 hs
        Días: Sábado 10:00 a 14:00hs
        Profe: Carlos Ríos  carlos.rios@educacionit.com
        
        Código de clases
        https://github.com/crios2020/javaadvSeptiembreSabados
        
        LTS:    Long Term Support   8 años
        
        versión         liberado            vence
        JDK 8 LTS       Marzo 2014          Marzo 2022
        JDK 9           Septiembre 2017     Marzo 2018
        JDK 10          Marzo 2018          Septiembre 2018
        JDK 11 LTS      Septiembre 2018     Septiembre 2026
        JDK 12          Marzo 2019          Septiembre 2019
        JDK 13          Septiembre 2019     Marzo 2020
        JDK 14          Marzo 2020          Septiembre 2020
        JDK 15          Septiembre 2020     Marzo 2021
        JDK 16          Marzo 2021          Septiembre 2021
        JDK 17 LTS      Septiembre 2021     Septiembre 2029
        
        IDE Opcional STS3
        
        */
        
        /*
        Programación de hilos
        
        
        Tarea 1:    Abrir y leer el file 1 en medio 1                   10 seg
        Tarea 2:    Abrir y leer el file 2 en medio 2                   10 seg
        Tarea 3:    Abrir Formulario y mostrar contenido de los files    1 seg
        
          Tarea 1     Tarea 2  Tarea 3
        |----------|----------|-|
            10 s        10 s   1 s
        
        Total: 21 s
        
        
          Tarea 1
        |----------|
            10 s
           Tarea 2
        |----------|
            10 s     
                    Tarea 3
                    |-|
                     1 s
        Total: 11 s
        
          Tarea 1
        |----------|
            10 s
           Tarea 2
        |----------|
            10 s 
        Tarea 3
        |-|
         1 s
        
        Total: 10s
        */
        
        HiloT hiloT1=new HiloT("hiloT1");
        HiloT hiloT2=new HiloT("hiloT2");
        HiloT hiloT3=new HiloT("hiloT3");
        HiloT hiloT4=new HiloT("hiloT4");
        
        //al invocar el método run() ejecuta en un mismo hilo
        //hiloT1.run();
        //hiloT2.run();
        //hiloT3.run();
        //hiloT4.run();
        
        //método start() invoca al método run() en un nuevo hilo(Thread)
        //hiloT1.start();
        //hiloT2.start();
        //hiloT3.start();
        //hiloT4.start();
        
        System.out.println("Cantidad de procesadores: "+
                Runtime.getRuntime().availableProcessors());
       
        HiloR hiloR1=new HiloR("hiloR1");
        HiloR hiloR2=new HiloR("hiloR2");
        HiloR hiloR3=new HiloR("hiloR3");
        HiloR hiloR4=new HiloR("hiloR4");
        
        Thread t1=new Thread(hiloR1);
        Thread t2=new Thread(hiloR2);
        Thread t3=new Thread(hiloR3);
        Thread t4=new Thread(hiloR4);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        new Thread(new HiloR("hiloR5")).start();
        
        
    }
}