package aula2528.ap;

import aula2528.ap.Modelos.Veiculo;
import aula2528.ap.Persistencia.VeiculoRepositoryImpl;

/**
 * Created by Alunoinf_2 on 24/04/2019.
 */
public class Main {
    public static void main(String[] args){
        VeiculoRepositoryImpl repo = new VeiculoRepositoryImpl();
        Veiculo car = new Veiculo("carro","vrum",1900,1901,10000);
        Veiculo newCar = repo.create(car);
        System.out.println(newCar);
        repo.close();
    }
}
