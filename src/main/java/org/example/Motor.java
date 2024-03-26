package org.example;


public class Motor implements Cloneable {
    private String cilindrada;
    private String potencia;

    public Motor(String cilindrada, String potencia) {
        super();
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Motor{" +
                "cilindrada='" + cilindrada + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
