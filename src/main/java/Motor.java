public class Motor implements Cloneable {
    private String cilindrada;
    private int potencia;

    public Motor(String cilindrada, int potencia) {
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

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
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
