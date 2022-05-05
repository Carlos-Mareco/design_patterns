class MenuItem extends MenuComponente {
    public MenuItem(String descricao, String link) {
        super(descricao, link);
    }

    public void print() {
        System.out.println(super.toString());
    }
}