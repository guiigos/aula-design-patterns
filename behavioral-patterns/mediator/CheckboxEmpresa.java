public class CheckboxEmpresa {

    private FormularioMediator mediator;

    public CheckboxEmpresa(FormularioMediator mediator) {
        this.mediator = mediator;
    }

    public void marcar() {
        System.out.println("Checkbox empresa marcado.");
        mediator.checkboxEmpresaAlterado(true);
    }

    public void desmarcar() {
        System.out.println("Checkbox empresa desmarcado.");
        mediator.checkboxEmpresaAlterado(false);
    }
}