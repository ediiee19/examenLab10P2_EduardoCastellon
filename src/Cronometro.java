
import javax.swing.JLabel;


public class Cronometro extends Thread{
    
    boolean on;
    public int minutos;
    public int segundos;

    public JLabel timer = new JLabel();

    public Cronometro(JLabel timer, boolean on) {
        this.timer = timer;
        minutos = 0;
        segundos = 0;
        on = on;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public JLabel getTimer() {
        return timer;
    }

    public void setTimer(JLabel timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        while (on) {
            if (segundos == 60) {
                segundos = 0;
                minutos++;
            }
            while (segundos != 60) {
                timer.setText(minutos + ":" + segundos);
                System.out.println(segundos);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                segundos++;
            }

        }
    }
    
}
