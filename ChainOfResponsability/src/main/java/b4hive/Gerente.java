package b4hive;

public class Gerente extends Funcionario {

    public Gerente(Funcionario superior) {
        super(superior);
    }

    @Override
    public String aprovarDesconto(double valor) {
        if (valor <= 50) {
            return "Desconto de " + valor + "% aprovado pelo gerente.";
        } else {
            return "Desconto de " + valor + "% não aprovado pelo gerente.";
        }
    }

}
