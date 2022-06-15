public class SuporteN2 extends Suporte {

    @Override
    public void encaminharChamado(Chamado chamado) {
        System.out.println("Suporte N2 viu o chamado #" + chamado.getId() + ".");
        if(chamado.getTipo() == 2) {
            System.out.println("Chamado #" + chamado.getId() + " enchaminhado para o Suporte N2");
        } else {
            super.encaminharProximo(chamado);
        }
    }
}
