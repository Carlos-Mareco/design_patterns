/**
 *  Protocol ou Interface para o Participante a implementar o método atualizar().
 * 
 *  Note que o Participante é um observador do monitor.
 *  
 */
public interface ParticipanteProtocol {
    // método update() do Padrão Observer (GoF)
    public void atualizar(int numero) throws Exception;
}
