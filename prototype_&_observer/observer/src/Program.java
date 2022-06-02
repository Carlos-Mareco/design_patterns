/**
 *  Código Cliente para testar o padrão de projeto Observer do programa.
 *  
 *  É um programa onde um monitor irá inserir números sorteados no sistema e irá informar todos os
 *  participantes que dados número foi sorteado. Os participantes irão verificar suas respectivas
 *  cartelas, em caso de acerto, irão informar.
 */
public class Program {
    public static void main(String[] args) throws Exception {
        Monitor monitor = new Monitor();

        // Foram instânciados os participantes João e Maria, além de defininir os números de suas
        // respectivas cartelas
        Participante joao = new Participante("João", new Cartela(1, 3, 5, 7, 9, 11));
        Participante maria = new Participante("Maria", new Cartela(2, 4, 5, 8, 10, 11));

        // Tanto João quanto Maria são inscritas no sistema
        monitor.inscrever(joao);
        monitor.inscrever(maria);


        try {
            // Números de teste para João ganhar o prêmio
            monitor.addNumeroSorteado(11);
            monitor.addNumeroSorteado(1);
            monitor.addNumeroSorteado(3);
            monitor.addNumeroSorteado(5);
            monitor.addNumeroSorteado(7);
            monitor.addNumeroSorteado(9);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}