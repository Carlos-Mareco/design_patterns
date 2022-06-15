// Interface para distribuição do padrão
interface ParteVisitor {
    public void visit(Cpu cpu);
    public void visit(Periferico perifefico);
}
