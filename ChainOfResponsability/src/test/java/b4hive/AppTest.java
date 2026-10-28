package b4hive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    Funcionario estagiario;
    Funcionario vendedor;
    Funcionario supervisor;
    Funcionario gerente;

    @BeforeEach 
    public void setup() {
        gerente = new Gerente(null);
        supervisor = new Supervisor(gerente);
        vendedor = new Vendedor(supervisor);
        estagiario = new Estagiario(vendedor);
    }

    @Test
    public void testDescontoAprovadoEstagiario() {
        String resultado = estagiario.aprovarDesconto(3);
        assertTrue(resultado.equals("Desconto de 3.0% aprovado pelo estagiário."));
    }

    @Test
    public void testDescontoAprovadoVendedor() {
        String resultado = estagiario.aprovarDesconto(7);
        assertTrue(resultado.equals("Desconto de 7.0% aprovado pelo vendedor."));
    }

    @Test
    public void testDescontoAprovadoSupervisor() {
        String resultado = estagiario.aprovarDesconto(20);
        assertTrue(resultado.contains("20.0% aprovado pelo supervisor."));
    }

    @Test
    public void testDescontoAprovadoGerente() {
        String resultado = estagiario.aprovarDesconto(40);
        assertTrue(resultado.contains("40.0% aprovado pelo gerente."));
    }

    @Test
    public void testDescontoNaoAprovado() {
        String resultado = estagiario.aprovarDesconto(55);
        assertTrue(resultado.contains("55.0% não aprovado pelo gerente."));
    }

}
