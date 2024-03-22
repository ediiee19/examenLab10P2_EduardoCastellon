
import java.io.Serializable;


public class Carro implements Serializable{
    
    protected String marca;
    protected String modelo;
    
    protected int velocidad;
    
    private static final long SerialVersionUID = 333L;

    public Carro() {
    }

    public Carro(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return marca + " " + modelo;
    }
    
}
