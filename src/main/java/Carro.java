import org.example.Motor;

public class Carro implements Cloneable {
    private int ano;
    private String modelo;
    private Motor motor;
    private String marca;

    public Carro(int ano, String modelo, Motor motor, String marca) {
        this.ano = ano;
        this.modelo = modelo;
        this.motor = motor;
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public Carro clone() throws CloneNotSupportedException {
        Carro carroClone = (Carro) super.clone();
        carroClone.motor = (Motor) carroClone.motor.clone();
        return carroClone;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "ano=" + ano +
                ", modelo='" + modelo + '\'' +
                ", motor=" + motor +
                ", marca='" + marca + '\'' +
                '}';
    }
}