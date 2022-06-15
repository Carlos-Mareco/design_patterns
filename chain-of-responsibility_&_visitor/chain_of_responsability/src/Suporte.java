public abstract class Suporte {
    private Suporte proximo;

    public Suporte setProximo(Suporte proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public abstract void encaminharChamado(Chamado chamado);

    public void encaminharProximo(Chamado chamado) {
        if(this.proximo != null) {
            proximo.encaminharChamado(chamado);
        } else {
            System.out.println("ERRO: Chamado #" + chamado.getId() + "não pôde ser enchaminhado");
        }
    }
}
