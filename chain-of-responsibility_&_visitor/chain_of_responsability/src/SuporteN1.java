public class SuporteN1 extends Suporte {

    @Override
    public void encaminharChamado(Chamado chamado) {
        System.out.println("Suporte N1 viu o chamado #" + chamado.getId() + ".");
        if(chamado.getTipo() == 1) {
            System.out.println("Chamado #" + chamado.getId() + " enchaminhado para o Suporte N1");
        } else {
            super.encaminharProximo(chamado);
        }
    }
}
