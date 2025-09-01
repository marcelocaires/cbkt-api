package br.dev.mmc.cbkt.controller.record;

public record EnderecoRecord(
    String cep,
    String logradouro,
    String complemento,
    String unidade,
    String bairro,
    String localidade,
    String uf,
    String estado,
    String regiao,
    String ibge,
    String gia,
    String ddd,
    String siafi
) {}