package org.example;

public class ConverterDolar implements ConversaoMoedas{
    @Override
    public float converter(float valorEmReais) {
        return valorEmReais / 5f;
    }
}
