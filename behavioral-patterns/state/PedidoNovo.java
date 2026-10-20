public class PedidoNovo implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento realizado.");
        pedido.setEstado(new PedidoPago());
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido novo não pode ser enviado.");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Pedido novo não pode ser entregue.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado.");
        pedido.setEstado(new PedidoCancelado());
    }
}