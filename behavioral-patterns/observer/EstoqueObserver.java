public class EstoqueObserver
        implements PedidoObserver {

    @Override
    public void atualizar() {
        System.out.println(
                "Atualizando estoque."
        );
    }
}