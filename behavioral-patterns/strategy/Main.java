public class Main {

    public static void main(String[] args) {

        EstrategiaDesconto estrategia = new DescontoFuncionario();

        CalculadoraDesconto calculadora = new CalculadoraDesconto(estrategia);

        double resultado = calculadora.calcular(1000);

        System.out.println(resultado);
    }
}