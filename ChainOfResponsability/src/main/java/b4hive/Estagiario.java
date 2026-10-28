package b4hive;

public class Estagiario extends Funcionario {

    public Estagiario(Funcionario superior) {
        super(superior);
    }

    @Override
    public String aprovarDesconto(double valor) {
        if (valor <= 5) {
            return "Desconto de " + valor + "% aprovado pelo estagiário.";
        } else {
            if (superior != null) {
                return superior.aprovarDesconto(valor);
            } else {
                return "Desconto de " + valor + "% não aprovado pelo estagiário.";
            }
        }
    }

}