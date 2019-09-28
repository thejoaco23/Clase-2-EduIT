package ar.com.eduit.curso.java.advanced.clase01;
import java.text.DecimalFormat;
import java.time.LocalTime;
import javax.swing.JTextField;
public class HoraR implements Runnable{
    private final JTextField txt;
    public HoraR(JTextField txt) {
        this.txt = txt;
    }
    @Override public void run(){
        while(true){
            LocalTime lt=LocalTime.now();
            DecimalFormat df=new DecimalFormat("00");
            txt.setText(df.format(lt.getHour())     +":"+
                        df.format(lt.getMinute())   +":"+
                        df.format(lt.getSecond()));
            try { Thread.sleep(1000); } catch (Exception e) { }
        }
    }
}