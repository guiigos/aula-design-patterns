public class PedidoEntregue implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pedido já foi entregue.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido já foi entregue.");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Pedido já foi entregue.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido entregue não pode ser cancelado.");
    }
}