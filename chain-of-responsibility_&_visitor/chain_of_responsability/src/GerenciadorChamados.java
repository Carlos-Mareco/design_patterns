import java.util.ArrayList;
import java.util.List;

public class GerenciadorChamados {
    private int contador_id;
    private List<Chamado> chamados = new ArrayList<>();

    public GerenciadorChamados() {
        this.contador_id = 0;
    }

    public void registrarChamado(int tipo_chamado) {
        this.contador_id++;
        Chamado novo = new Chamado(contador_id, tipo_chamado);
        chamados.add(novo);
    }

    public void registrarChamado(int tipo_chamado, String descricao) {
        this.contador_id++;
        Chamado novo = new Chamado(contador_id, tipo_chamado, descricao);
        chamados.add(novo);
        System.out.println("Chamado registrado");
    }

    public void registrarChamado(String modalidade, String descricao) throws Exception {
        if(modalidade.equalsIgnoreCase("remoto")) {
            this.contador_id++;
            Chamado novo = new Chamado(contador_id, 1, descricao);
            chamados.add(novo);
        } else if(modalidade.equalsIgnoreCase("presencial")) {
            this.contador_id++;
            Chamado novo = new Chamado(contador_id, 2, descricao);
            chamados.add(novo);
        } else if(modalidade.equalsIgnoreCase("assistencia")) {
            this.contador_id++;
            Chamado novo = new Chamado(contador_id, 3, descricao);
            chamados.add(novo);
        } else {
            throw new Exception("ERRO: Tipo de chamado não reconhecido");
        }
    }

    public void addChamado(Chamado chamado) throws Exception {
        if(chamado.getTipo() >= 1 && chamado.getTipo() <= 3) {
            chamados.add(chamado);
        } else {
            throw new Exception("ERRO: Tipo de chamado não reconhecido");
        }
    }

    public Chamado getChamado(int id) {
        for(Chamado i : chamados) {
            if(i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    public Chamado getUltimoChamado() throws Exception {
        if(chamados.size() != 0) {
            return chamados.get(chamados.size()-1);
        } else {
            throw new Exception("ERRO: Não tem chamado registrado");
        }
    }
}
