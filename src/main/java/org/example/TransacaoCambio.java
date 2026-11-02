package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TransacaoCambio {
    private float valorEmReais;

    public TransacaoCambio(float valorEmReais) {
        this.valorEmReais = valorEmReais;
    }

    public float calcularConversao(ConversaoMoedas conversao) {
        float valor = conversao.converter(valorEmReais);

        BigDecimal bd = new BigDecimal(Float.toString(valor));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        float resultado = bd.floatValue();

        return resultado;
    }
}
