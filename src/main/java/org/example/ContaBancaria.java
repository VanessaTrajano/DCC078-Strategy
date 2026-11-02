package org.example;

public class ContaBancaria {
    private float saldoConvertido;

    public float getSaldoConvertido() {
        return saldoConvertido;
    }

    public void converterParaDolar(float valorEmReais) {
        TransacaoCambio transacao = new TransacaoCambio(valorEmReais);
        this.saldoConvertido = transacao.calcularConversao(new ConverterDolar());
    }

    public void converterParaEuro(float valorEmReais) {
        TransacaoCambio transacao = new TransacaoCambio(valorEmReais);
        this.saldoConvertido = transacao.calcularConversao(new ConverterEuro());
    }

    public void converterParaIene(float valorEmReais) {
        TransacaoCambio transacao = new TransacaoCambio(valorEmReais);
        this.saldoConvertido = transacao.calcularConversao(new ConverterIene());
    }

    public void converterParaLibra(float valorEmReais) {
        TransacaoCambio transacao = new TransacaoCambio(valorEmReais);
        this.saldoConvertido = transacao.calcularConversao(new ConverterLibra());
    }
}
