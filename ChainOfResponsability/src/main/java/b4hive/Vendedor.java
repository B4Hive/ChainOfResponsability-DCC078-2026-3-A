package b4hive;

public class Vendedor extends Funcionario {

    public Vendedor(Funcionario superior) {
        super(superior);
    }

    @Override
    public String aprovarDesconto(double valor) {
        if (valor <= 10) {
            return "Desconto de " + valor + "% aprovado pelo vendedor.";
        } else {
            if (superior != null) {
                return superior.aprovarDesconto(valor);
            } else {
                return "Desconto de " + valor + "% não aprovado pelo vendedor.";
            }
        }
    }

}