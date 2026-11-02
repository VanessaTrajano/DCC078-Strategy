package org.example;

public class ConverterLibra implements ConversaoMoedas{
    @Override
    public float converter(float valorEmReais) {
        return valorEmReais / 7f;
    }
}
