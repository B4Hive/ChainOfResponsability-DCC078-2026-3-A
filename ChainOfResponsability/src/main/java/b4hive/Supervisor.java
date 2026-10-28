package b4hive;

public class Supervisor extends Funcionario {

    public Supervisor(Funcionario superior) {
        super(superior);
    }

    @Override
    public String aprovarDesconto(double valor) {
        if (valor <= 25) {
            return "Desconto de " + valor + "% aprovado pelo supervisor.";
        } else {
            if (superior != null) {
                return superior.aprovarDesconto(valor);
            } else {
                return "Desconto de " + valor + "% não aprovado pelo supervisor.";
            }
        }
    }

}