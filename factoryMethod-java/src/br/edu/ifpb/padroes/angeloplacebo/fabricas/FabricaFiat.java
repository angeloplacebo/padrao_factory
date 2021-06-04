package br.edu.ifpb.padroes.angeloplacebo.fabricas;

import br.edu.ifpb.padroes.angeloplacebo.carros.Carro;
import br.edu.ifpb.padroes.angeloplacebo.carros.Palio;

public class FabricaFiat implements FabricaDeCarro {
    @Override
    public Carro criarCarro() {
        return new Palio();
    }
}
