public class DescontoComum implements EstrategiaDesconto {

    @Override
    public double calcular(double valor) {
        return valor;
    }
}