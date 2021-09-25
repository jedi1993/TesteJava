package br.com.abc.Projeto;

import java.sql.SQLException;
import java.sql.Statement;

public class InserirDados {
    public static void inserir(AutoCloseable sigaBemSaida, SigaBemEntrada sigaBemEntrada){


        String sql = "INSERT INTO`agencia`.`empresa` SET `valor total frete`='"+" peso ='"+sigaBemEntrada.getPeso()+" nome destinatario ='"+sigaBemEntrada.getNomeDestinatario()+" CEP Origem ='"+sigaBemEntrada.getDDD()+"";
        sigaBemSaida = Conexão.getConexao();
        AutoCloseable stmt =  sigaBemSaida;

        Conexão.close(stmt,sql);
        System.out.println("Registro atualizado com sucesso");
    }
}
