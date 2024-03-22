
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class RaceThread extends Thread {

    protected transient JPanel gamepanJPanel = new JPanel();

    protected JProgressBar car1 = new JProgressBar();
    protected JProgressBar car2 = new JProgressBar();

    protected transient JLabel timerLabel = new JLabel();

    protected int vel1;
    protected int vel2;

    protected boolean start;

    public int minutos;
    public int segundos;

    public RaceThread() {
    }

    public RaceThread(JPanel gameJPanel, int vel1, int vel2, JProgressBar car1, JProgressBar car2, JLabel timerLabel) {
        this.gamepanJPanel = gamepanJPanel;

        this.vel1 = vel1;
        this.vel2 = vel2;

        this.car1 = car1;
        this.car2 = car2;

        this.timerLabel = timerLabel;

        this.start = true;
    }

    @Override
    public void run() {

        while (start) {
            if (segundos == 60) {
                segundos = 0;
                minutos++;
            }
            while (segundos != 60) {
                if (car1.getValue() == car1.getMaximum() || car2.getValue() == car2.getMaximum()) {
                    start = false;
                } else {
                    segundos++;
                    car1.setValue(car1.getValue() + vel1 / 10);
                    car2.setValue((car2.getValue() + vel2 / 10));
                    timerLabel.setText(minutos + ":" + segundos);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
        System.out.println("hola");
        if (car1.getValue() > car2.getValue()) {
                JOptionPane.showMessageDialog(null,
                        "El carro 1 ha ganado con un tiempo de: " + minutos + " minutos y " + segundos + " segundos");
            } else if (car1.getValue() < car2.getValue()) {
                JOptionPane.showMessageDialog(null,
                        "El carro 1 ha ganado con un tiempo de: " + minutos + " minutos y " + segundos + " segundos");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Ha habido un empate con un tiempo de: " + minutos + " minutos y " + segundos + " segundos");
            }
        car1.setValue(0);
        car2.setValue(0);
        minutos = 0;
        segundos = 0;
    }

    public JProgressBar getCar1() {
        return car1;
    }

    public void setCar1(JProgressBar car1) {
        this.car1 = car1;
    }

    public JProgressBar getCar2() {
        return car2;
    }

    public void setCar2(JProgressBar car2) {
        this.car2 = car2;
    }

    public JLabel getTimerLabel() {
        return timerLabel;
    }

    public void setTimerLabel(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    public int getVel1() {
        return vel1;
    }

    public void setVel1(int vel1) {
        this.vel1 = vel1;
    }

    public int getVel2() {
        return vel2;
    }

    public void setVel2(int vel2) {
        this.vel2 = vel2;
    }

    public JPanel getGamepanJPanel() {
        return gamepanJPanel;
    }

    public void setGamepanJPanel(JPanel gamepanJPanel) {
        this.gamepanJPanel = gamepanJPanel;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
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

    
    
}
