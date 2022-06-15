/**
 *  Código Cliente para testar o padrão de projeto Chain of Responsability do programa.
 *  
 *  É um simulador de níveis de suporte. Um usuário registra um chamado e esse chamado é
 *  resolvido por um nível de suporte especifico.
 *  Uma vez encaminhado o chamado, o primeiro nível vai ver se pode resolver, caso não pode,
 *  ele enchaminha para o próximo nível e assim sucessivamente. 
 */

public class Cliente {
    public static void main(String[] args) throws Exception {
        GerenciadorChamados gerenciadorChamado = new GerenciadorChamados();
        SuporteN1 n1 = new SuporteN1();

        n1.setProximo(new SuporteN2()).setProximo(new SuporteN3());

        gerenciadorChamado.registrarChamado(
            "Assistencia", 
            "Circuito da placa da impressora danificado."
        );

        gerenciadorChamado.registrarChamado(
            "Remoto", 
            "Definir o Google Chrome como navegador padrão."
        );

        try {
            n1.encaminharChamado(gerenciadorChamado.getChamado(1));
            n1.encaminharChamado(gerenciadorChamado.getUltimoChamado());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}  
