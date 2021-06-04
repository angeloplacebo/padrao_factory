package br.edu.ifpb.padroes.angeloplacebo.fabricas;

import br.edu.ifpb.padroes.angeloplacebo.carros.Carro;
import br.edu.ifpb.padroes.angeloplacebo.carros.Gol;

public class FabricaWolks implements FabricaDeCarro {
    @Override
    public Carro criarCarro() {
        return new Gol();
    }
}
