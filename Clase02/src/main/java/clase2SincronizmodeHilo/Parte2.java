
package clase2SincronizmodeHilo;

import java.util.Collection;
import java.util.Collections;


 
public class Parte2 {
          public static void main(String[] args) {
    Cuenta cuenta = new Cuenta();
    Cliente cliente1 = new Cliente(cuenta);
    Cliente cliente2= new Cliente (cuenta);
    //son conyuges x eso comparten cuenta
    new Thread(cliente1).start();
    new Thread(cliente2).start();
    
    //qye diferencia existe entre HAshmap y Hastable
    /*ambas son implementraciones de la interface MAP
    Has<String, String>mapa1=new Hasmap();
    mapa1.put("lu", "Lunes")
    syso ( mapa.ger("lu"))
    //
    
    HashMap:
    -Metodos mp sincronizados
    -No sirve para multihilos
    -Es màs veloz
   
    HashTable:
    -Metodos sincronizados totalmente 
    -Siver para multithread
    -Es màs lento
    -es una clase legacy 
    
    Collections:
    -Provee utilidades para colleciones.
    -Tiene  un factory para armar colleciones parcialmente sincronizadas
    
    
    
    
    
    
    //hastable esta preparado par multi hilo
    Hastable<String, string>mapa2=new HAstable();
   mapa2.put("luss", "Lunes");
        syso ( mapa2.get("lu"));
    */
Map<String,String>mapa3=Collections.synchronizedMap(new HashMap());
mapa3.put("lu","lunes");
              System.out.println(mapa3.get("lu"));
        
        
          }
}