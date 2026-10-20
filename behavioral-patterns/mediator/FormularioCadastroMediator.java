public class FormularioCadastroMediator
        implements FormularioMediator {

    private CampoCnpj campoCnpj;

    public FormularioCadastroMediator(CampoCnpj campoCnpj) {

        this.campoCnpj = campoCnpj;
    }

    @Override
    public void checkboxEmpresaAlterado(
            boolean marcado) {

        if (marcado) {
            campoCnpj.habilitar();
        } else {
            campoCnpj.desabilitar();
        }
    }

    @Override
    public void cadastrar() {

        if (campoCnpj.isHabilitado()) {
            System.out.println("Validando CNPJ...");
        }

        System.out.println("Realizando cadastro...");
    }
}