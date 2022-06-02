/**
 *  Implementação concreta do MonitorProtocol
 *  
 */
import java.util.ArrayList;
import java.util.List;

public class Monitor implements MonitorProtocol {
    // List para armazenar os participantes
    private List<Participante> participantes = new ArrayList<>();
    // List para armazenar os números que já foram sorteados
    private List<Integer> numerosSorteados = new ArrayList<>();

    // Inscreve um participante no monitor e verifica se sua cartela não foi registrada
    @Override
    public void inscrever(Participante participante) {
        if(!hasCartela(participante.getCartela())) {
            this.participantes.add(participante);
            System.out.println("Participante " + participante.getNome() + " foi inscrito.");
        }
    }

    // Remove um participante do monitor
    @Override
    public void desinscrever(Participante participante) {
        this.participantes.remove(participantes.indexOf(participante));
    }

    // Notifica todos os participantes dos números que foram sorteados
    @Override
    public void notificar(int numero) throws Exception {
        for (Participante object : participantes) {
            object.atualizar(numero);
        }
    }

    // Adiciona um número sorteado e já chama o método notificar()
    public void addNumeroSorteado(int numero) throws Exception {
        // Realiza uma verificação para saber se um número já foi sorteado
        if(hasNumero(numero)) {
            System.out.println("Este número já foi sorteado!");
        } else {
            numerosSorteados.add(numero);
            notificar(numero);
        }
    }

    // Verifica se um número já está na lista
    public boolean hasNumero(Integer numero) {
        for (Integer i : numerosSorteados) {
            if (numero == i) {
                return true;
            }
        }
        return false;
    }

    // Verifica se uma cartela já está na lista
    public boolean hasCartela(Cartela cartela) {
        for (Participante i : participantes) {
            if (cartela.getId() == i.getCartela().getId()) {
                return true;
            }
        }
        return false;
    }
}
