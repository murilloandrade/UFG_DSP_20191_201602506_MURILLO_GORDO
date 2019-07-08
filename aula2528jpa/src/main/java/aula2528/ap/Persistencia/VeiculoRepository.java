package aula2528.ap.Persistencia;

import aula2528.ap.Modelos.Veiculo;

import java.util.List;

public interface VeiculoRepository {
    Veiculo create(Veiculo veiculo);

    Veiculo read(Long id);

    List<Veiculo> findByModelo(String modelo);

    Veiculo update(Veiculo veiculo);

    void delete(Veiculo veiculo);

    void close();
}
