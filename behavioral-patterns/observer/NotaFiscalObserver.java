public class NotaFiscalObserver
        implements PedidoObserver {

    @Override
    public void atualizar() {
        System.out.println(
                "Gerando nota fiscal."
        );
    }
}