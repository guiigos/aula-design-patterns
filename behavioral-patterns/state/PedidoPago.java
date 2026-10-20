public class PedidoPago implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pedido já está pago.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido enviado.");
        pedido.setEstado(new PedidoEnviado());
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Pedido pago ainda não pode ser entregue.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado.");
        pedido.setEstado(new PedidoCancelado());
    }
}