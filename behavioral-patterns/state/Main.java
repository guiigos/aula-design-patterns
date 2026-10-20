public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.setEstado(new PedidoPago());

        pedido.pagar();
        pedido.enviar();
        pedido.entregar();
    }
}