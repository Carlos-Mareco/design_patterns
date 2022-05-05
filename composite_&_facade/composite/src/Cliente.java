public class Cliente {
    public static void main(String[] args) {
        new Cliente().montarMenu();
    }

    public void montarMenu() {
        Menu parte = new Menu("Parte 1");
        parte.add(new MenuItem("Item 1", "Evento 1"));
        parte.add(new MenuItem("Item 2", "Evento 2"));

        Menu tabela = new Menu("Tabelas");
        tabela.add(new MenuItem("Tabela 1", "Evento 3"));
        tabela.add(new MenuItem("Tabela 2", "Evento 4"));
        tabela.add(new MenuItem("Tabela 3", "Evento 5"));

        Menu menu = new Menu("Menu");
        menu.add(parte);
        menu.add(tabela);

        menu.print();
    }
}