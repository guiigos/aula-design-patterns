public abstract class Relatorio {

    public final void gerar() {

        buscarDados();
        processarDados();
        gerarArquivo();
        salvarArquivo();
    }

    private void buscarDados() {
        System.out.println("Buscando dados do banco...");
    }

    private void processarDados() {
        System.out.println("Processando dados...");
    }

    protected abstract void gerarArquivo();

    private void salvarArquivo() {
        System.out.println("Salvando arquivo...");
    }
}