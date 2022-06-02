/**
 *  Implementação concreta do ParticipanteProtocol
 *  
 */
public class Participante implements ParticipanteProtocol{
    private String nome;
    private Cartela cartela; // Armazena a cartela de um usuário
    private int acertos; // Armazena a quantidad de acertos da cartela

    // Cria uma instância do participante com a tabela
    public Participante(String nome, Cartela cartela) {
        this.nome = nome;
        this.cartela = cartela;
        this.acertos = 0;
    }

    public Participante(String nome) {
        this.nome = nome;
        this.acertos = 0;
    }

    // Atualiza os números da cartela do participante
    @Override
    public void atualizar(int numero) throws Exception{
        // Se ele tiver um número, então é acrescentado em acertos
        if(cartela.hasNumero(numero)) {
            acertos++;
            System.out.println(this.nome + " encontrou o número " + numero);
        }
        // Se o participante acertas todos os números, é lançada uma Exception
        if(isVencedor()) {
            throw new Exception(this.nome + " ganhou, cartela de ID: #" + cartela.getId());
        }
    }

    // Define a cartela do participante caso ainda não esteja
    public void setCartela(Cartela cartela) {
        this.cartela = cartela;
    }

    public String getNome() {
        return nome;
    }

    public Cartela getCartela() {
        return cartela;
    }

    // Verifica se todos os números da cartela foram acertados
    public boolean isVencedor() {
        boolean vencedor = false;
        if(acertos == cartela.getTamCartela()) {
            vencedor = true;
        }
        return vencedor;
    }
}
