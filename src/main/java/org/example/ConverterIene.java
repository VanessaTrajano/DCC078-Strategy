package org.example;

public class ConverterIene implements ConversaoMoedas{
    @Override
    public float converter(float valorEmReais) {
        return valorEmReais * 29f;
    }
}
