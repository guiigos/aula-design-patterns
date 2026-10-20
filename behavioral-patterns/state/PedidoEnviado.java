public class PedidoEnviado implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pedido enviado já foi pago.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido já foi enviado.");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Pedido entregue.");
        pedido.setEstado(new PedidoEntregue());
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido enviado não pode ser cancelado.");
    }
}