/**
 *  Classe responsável por gerenciar os valores de uma cartela. Cada participante deve ter sua
 *  própria cartela.
 * 
 *  Cada cartela tem um ID, uma quantidade de números (por padrão é 6) que podem ser preenchidos.
 *  
 */
import java.util.List;
import java.util.ArrayList;

public class Cartela {
    private int id = 0;
    private List<Integer> numeros = new ArrayList<>(); // guarda os números da tabela
    private static int countId = 0;
    private int tamCartela; // tamanho da cartela

    public Cartela(int tamCartela) {
        this.id = countId;
        this.tamCartela = tamCartela;
        countId++;
    }

    public Cartela() {
        this.id = countId;
        this.tamCartela = 6; // o tamanho padrão é 6
        countId++;
    }

    // Instânciar cartela com valores
    public Cartela(Integer... valores) {
        this.id = countId;
        this.tamCartela = 6; // o tamanho padrão é 6
        setNumeros(valores);
        countId++;
    }

    // Inserir valores na cartela
    public void setNumeros(Integer... valores) {
        int i = 0;
        for (Integer valor : valores) {
            if((valor >= 1 || valor <= 50) && i < this.tamCartela) {
                i++;
                numeros.add(valor);
            }
        }
    }

    // Retorna uma String com os números da cartela
    public String getNumeros() {
        String valores = "";
        for(int valor : this.numeros) {
            valores += "" + valor;
            valores += " ";
        }
        return valores;
    }

    // Exibe os números da cartela e o ID
    public void showCartela() {
        System.out.println("Cartela ID: " + this.id);
        System.out.println("Números: " + this.getNumeros());
    }


    // Verifica se um número já tem na cartela
    public boolean hasNumero(Integer numero) {
        for (Integer i : numeros) {
            if(numero == i) {
                return true;
            }
        }
        return false;
    }

    // Retorna o tamanho da cartela
    public int getTamCartela() {
        return tamCartela;
    }

    // Retorna o ID da tabela
    public int getId() {
        return id;
    }
}
