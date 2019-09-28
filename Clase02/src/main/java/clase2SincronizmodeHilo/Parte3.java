/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2SincronizmodeHilo;


public class Parte3 {
    //para que el sincronizado funcione el objeto  saludo debe ser unico
    public static void main(String[] args) {
        Saludo saludo=new Saludo();        
        new Thread(new Empleado("Javier",false,saludo)).start();
        new Thread(new Empleado("Raul",false,saludo)).start();
        new Thread(new Empleado("CAmila",false,saludo)).start();
        try {
            Thread.sleep(100);} catch (Exception e) {
        }         new Thread(new Empleado("Jefe",true,saludo)).start();


                
    }
    
        
    
}
