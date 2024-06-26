import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarroTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Carro carro = new Carro(1997, "Ford Ranger", new Motor("2200cc", 150), "Ford");

        Carro carroClone = carro.clone();
        carroClone.setAno(1998);
        carroClone.setModelo("Ford Bronco");
        carroClone.getMotor().setCilindrada("2300cc");

        assertEquals("Carro{ano=1997, modelo='Ford Ranger', motor=Motor{cilindrada='2200cc', potencia=150}, marca='Ford'}", carro.toString());
        assertEquals("Carro{ano=1998, modelo='Ford Bronco', motor=Motor{cilindrada='2300cc', potencia=150}, marca='Ford'}", carroClone.toString());
    }
}