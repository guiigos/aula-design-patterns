public class PedidoCancelado implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pedido está cancelado.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido está cancelado.");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Pedido está cancelado.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido já está cancelado.");
    }
}