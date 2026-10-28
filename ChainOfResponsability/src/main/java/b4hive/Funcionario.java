package b4hive;

public abstract class Funcionario {
    protected Funcionario superior;

    public Funcionario(Funcionario superior) {
        this.superior = superior;
    }

    public abstract String aprovarDesconto(double valor);

}
