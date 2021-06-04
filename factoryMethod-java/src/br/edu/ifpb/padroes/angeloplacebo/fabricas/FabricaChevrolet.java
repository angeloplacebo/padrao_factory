package br.edu.ifpb.padroes.angeloplacebo.fabricas;

import br.edu.ifpb.padroes.angeloplacebo.carros.Carro;
import br.edu.ifpb.padroes.angeloplacebo.carros.Celta;

public class FabricaChevrolet implements FabricaDeCarro {
    @Override
    public Carro criarCarro() {
        return new Celta();
    }
}
