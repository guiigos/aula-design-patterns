public class Main {

    public static void main(String[] args) {

        CampoCnpj campoCnpj = new CampoCnpj();

        FormularioCadastroMediator mediator = new FormularioCadastroMediator(campoCnpj);
        CheckboxEmpresa checkbox = new CheckboxEmpresa(mediator);
        BotaoCadastrar botao = new BotaoCadastrar(mediator);

        checkbox.marcar();
        botao.clicar();
    }
}