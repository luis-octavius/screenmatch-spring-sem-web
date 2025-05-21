package br.com.alura.screenmatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe) throws JsonProcessingException; // Uso de generics, não sei o que vai me retornar, portanto, utilizo o Generics que pode significar qualquer coisa
}
