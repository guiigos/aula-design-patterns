public class BotaoCadastrar {

    private FormularioMediator mediator;

    public BotaoCadastrar(FormularioMediator mediator) {
        this.mediator = mediator;
    }

    public void clicar() {
        System.out.println("Botão cadastrar pressionado.");
        mediator.cadastrar();
    }
}