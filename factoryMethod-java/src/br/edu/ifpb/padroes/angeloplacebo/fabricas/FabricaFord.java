package br.edu.ifpb.padroes.angeloplacebo.fabricas;

import br.edu.ifpb.padroes.angeloplacebo.carros.Carro;
import br.edu.ifpb.padroes.angeloplacebo.carros.Fiesta;

public class FabricaFord implements FabricaDeCarro {
    @Override
    public Carro criarCarro() {
        return new Fiesta();
    }
}
