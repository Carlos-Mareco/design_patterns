public class Chamado {
    private int id;
    private int tipo;
    private String descricao;

    public Chamado(int id, int tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public Chamado(int id, int tipo, String descricao) {
        this(id, tipo);
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public int getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
