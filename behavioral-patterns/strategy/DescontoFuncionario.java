public class DescontoFuncionario implements EstrategiaDesconto {

    @Override
    public double calcular(double valor) {
        return valor * 0.80;
    }
}