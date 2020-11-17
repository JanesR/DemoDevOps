public class Calculadora {

    public int somar(int valor1, int valor2){
        return valor1 + valor2;
    }

    public int subtrair(int valor1, int valor2){
        return valor1 - valor2;
    }

    public int multiplicar(int valor1, int valor2){
        return valor1 * valor2;
    }

    public float dividir(int valor1, int valor2){
        if(valor2 > 0){
            return valor1 / valor2;
        }else{
            return 0;
        }

    }
}
