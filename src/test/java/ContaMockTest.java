import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ContaMock.class)

public class ContaMockTest {

    @Test
    public void depositarValorTesteMock() throws Exception{

        double valorEsperado = 1010;
        double valorAtual = 0;
        final String METHOD="getSaldo";

        ContaMock contaMock = new ContaMock();
        ContaMock spy = PowerMockito.spy(contaMock);
        PowerMockito.when(spy, METHOD).thenReturn( (Double) 1000.00);

        valorAtual = spy.depositarValor(10);

        Assert.assertEquals(valorEsperado, valorAtual, 0);

    }

    @Test
    public void depositarValorMenorMock() throws Exception{

        double valorEsperado = 0;
        double valorAtual = 0;
        //final String METHOD="getSaldo";

        ContaMock contaMock = new ContaMock();
        //ContaMock spy = PowerMockito.spy(contaMock);
        //PowerMockito.when(spy, METHOD).thenReturn( (Double) 1000.00);

        //valorAtual = spy.depositarValor(11);
        valorAtual = contaMock.depositarValor(11);
        Assert.assertEquals(valorEsperado, valorAtual, 0);

    }


}
