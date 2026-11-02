import org.example.ContaBancaria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    @Test
    void deveConverterDolarContaBancaria() {
        ContaBancaria conta = new ContaBancaria();
        conta.converterParaDolar(100.0f);
        assertEquals(20.0f, conta.getSaldoConvertido());
    }

    @Test
    void deveConverterLibraContaBancaria() {
        ContaBancaria conta = new ContaBancaria();
        conta.converterParaLibra(100.0f);
        assertEquals(14.29f, conta.getSaldoConvertido());
    }

    @Test
    void deveConverterEuroContaBancaria() {
        ContaBancaria conta = new ContaBancaria();
        conta.converterParaEuro(100.0f);
        assertEquals(16.67f, conta.getSaldoConvertido());
    }

    @Test
    void deveConverterIeneContaBancaria() {
        ContaBancaria conta = new ContaBancaria();
        conta.converterParaIene(100.0f);
        assertEquals(2900.0f, conta.getSaldoConvertido());
    }
}