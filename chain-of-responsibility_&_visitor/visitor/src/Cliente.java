// O usuário trabalha com montagem de computadores que podem possuir vários periféricos. Ele deseja
// mostrar a descrição desses computadores de forma mais simples possível.

// Classe exemplo de uso
public class Cliente {
    public static void main(String[] args) {
        ParteComp computador = new Cpu();
        computador.adicionar(new ShowVisitor());
    }
}
