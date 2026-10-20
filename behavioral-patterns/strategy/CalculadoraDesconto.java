public class CalculadoraDesconto {

    private EstrategiaDesconto estrategia;

    public CalculadoraDesconto(EstrategiaDesconto estrategia) {
        this.estrategia = estrategia;
    }

    public double calcular(double valor) {
        return estrategia.calcular(valor);
    }
}