public class EmailObserver
        implements PedidoObserver {

    @Override
    public void atualizar() {
        System.out.println(
                "Enviando e-mail de confirmação."
        );
    }
}