package org.example;

public class ConverterEuro implements ConversaoMoedas{
    @Override
    public float converter(float valorEmReais) {
        return valorEmReais / 6f;
    }
}
