public class Main {

    public static void main(String[] args) {

        PedidoService pedidoService = new PedidoService();

        pedidoService.adicionarObserver(
                new EmailObserver()
        );

        PedidoObserver estoque = new EstoqueObserver();
        pedidoService.adicionarObserver(
                estoque
        );

        PedidoObserver nota = new NotaFiscalObserver();
        pedidoService.adicionarObserver(
                nota
        );

        pedidoService.confirmarPedido();

        System.out.println("---------");

        pedidoService.removerObserver(estoque);
        pedidoService.removerObserver(nota);

        pedidoService.confirmarPedido();
    }
}