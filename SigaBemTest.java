package br.com.abc.Projeto;

import curiosidades3.Comprador;
import curiosidades3.Comprador2;

public class SigaBemTest {
    public static void main(String[] args) {
        SigaBemEntrada sigaBemEntrada = new SigaBemEntrada(20.5, "421.2321.33", "MG", "Fernando");
        SigaBemSaida sigaBemSaida = new SigaBemSaida(200.0, "421.2321.33", "MG");
        InserirDados.inserir(sigaBemSaida,sigaBemEntrada);
    }

}
