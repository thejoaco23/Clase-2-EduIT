package ar.com.eduit.curso.java.advanced.clase01;
import java.text.DecimalFormat;
import javax.swing.JTextField;
public class CronometroR implements Runnable{
    private JTextField txt;
    private int cont=0;
    private boolean correr=false;
    public CronometroR(JTextField txt) {
        this.txt = txt;
    }
    @Override public void run(){
        while(true){
            if(correr){
                cont++;
                txt.setText(new DecimalFormat("0000").format(cont));
            }
            try { Thread.sleep(1000); } catch (Exception e) { }
        }
    }
    public void start(){ correr=true;   }
    public void pause(){ correr=false;  }
    public void reset(){
        correr=false;
        cont=0;
        txt.setText("0000");
    }
}