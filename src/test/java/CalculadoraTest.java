import org.junit.Test;
import org.testng.Assert;

public class CalculadoraTest {

    @Test
    public void somarSimplesValor(){
        Calculadora calculadora = new Calculadora();

        int atual = 0;
        int esperado = 2;

        atual = calculadora.somar(1,1);

        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void subtrairSimplesValor(){
        Calculadora calculadora = new Calculadora();

        int atual = 0;
        int esperado = 0;

        atual = calculadora.subtrair(5,5);

        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void multiplicarSimplesValor(){
        Calculadora calculadora = new Calculadora();

        int atual = 0;
        int esperado = 10;

        atual = calculadora.multiplicar(2,5);

        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void dividirSimplesValor(){
        Calculadora calculadora = new Calculadora();

        float atual = 0;
        float esperado = 5;

        atual = calculadora.dividir(10,2);

        Assert.assertEquals(esperado,atual);
    }


}
