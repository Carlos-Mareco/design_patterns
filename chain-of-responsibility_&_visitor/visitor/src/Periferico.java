// Modificação na classe para implementação de um periférico
class Periferico implements ParteComp {
    private String nome;
    public Periferico(String nome) {
        this.nome = nome;
    }
    public String toString() {
        return nome;
    }
    public void adicionar(ParteVisitor parteVisitor) {
        parteVisitor.visit(this);
    }
}