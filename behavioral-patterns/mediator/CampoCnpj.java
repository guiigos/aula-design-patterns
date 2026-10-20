public class CampoCnpj {

    private boolean habilitado;

    public void habilitar() {
        habilitado = true;
        System.out.println("Campo CNPJ habilitado.");
    }

    public void desabilitar() {
        habilitado = false;
        System.out.println("Campo CNPJ desabilitado.");
    }

    public boolean isHabilitado() {
        return habilitado;
    }
}