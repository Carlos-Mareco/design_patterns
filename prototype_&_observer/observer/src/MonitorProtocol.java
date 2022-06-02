/**
 *  Protocol ou Interface para o Monitor a implementar os métodos inscrever(), desinscrever() e
 *  notificar();
 * 
 *  Note que o Monitor é um observável para o participante.
 *  
 */
public interface MonitorProtocol {
    /* métodos do Padrão Observer (GoF) */
    public void inscrever(Participante participante);
    public void desinscrever(Participante participante);
    public void notificar(int numero) throws Exception;
}
