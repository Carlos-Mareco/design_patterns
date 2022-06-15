public class SuporteN3 extends Suporte {

    @Override
    public void encaminharChamado(Chamado chamado) {
        System.out.println("Suporte N3 viu o chamado #" + chamado.getId() + ".");
        if(chamado.getTipo() == 3) {
            System.out.println("Chamado #" + chamado.getId() + " enchaminhado para o Suporte N3");
        } else {
            super.encaminharProximo(chamado);
        }
    }
}
