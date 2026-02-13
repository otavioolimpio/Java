package exercicios.desafioProjeto.facade;

import exercicios.desafioProjeto.subsistema1.crm.CrmService;
import exercicios.desafioProjeto.subsistema2.cep.CepApi;

public class Facade {

      public void migraClente(String nome, String cep){

        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
