package control;

import model.Bicicleta;
import model.Carro;
import model.Caminhao;
import model.Veiculo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class AutomovelController {
    public static void main(String[] args) {

        Bicicleta bike_1 = new Bicicleta(2,"humana","caloi","caloi 10",2019,20,"16");
        Bicicleta bike_2 = new Bicicleta(2,"humana","caloi","caloi 100",2020,20,"18");
        Bicicleta bike_3 = new Bicicleta(2,"humana","caloi","calor 200",2022,20,"17");
        Bicicleta bike_4 = new Bicicleta(2,"humana","caloi","caloi 10",2019,20,"18");
        Bicicleta bike_5 = new Bicicleta(2,"humana","caloi","caloi 300",2017,20,"19");

//        System.out.println(
//                        "\nMarca: " + bike_1.getMarca()+
//                        "\nModelo: " + bike_1.getModelo() +
//                        "\nChassi: " + bike_1.getChassi() +
//                        "\nNumero de Eixos: " + bike_1.getNumeroDeeixos()+
//                        "\nAno de Fabricacao: " + bike_1.getAnoFrabricacao() +
//                        "\nTamanho da Roda: " + bike_1.getTamanhoRoda() +
//                        "\nPropulsão: " + bike_1.getPropulsao()
//        );

        Carro car_1 = new Carro(2,"Gasolina","Ford","Fiesta",2011,350);
        Carro car_2 = new Carro(2,"Flex","Chevrolet","Onix",2020,300);
        Carro car_3 = new Carro(2,"Gasolina","Fiat","Uno",2015,400);
        Carro car_4 = new Carro(2,"Flex","Ford","Focus",2013,450);
        Carro car_5 = new Carro(2,"Gasolina","Renault","Clio",2021,275);

//        System.out.println(
//                        "\nNumero de eixos: " + car_1.getNumeroDeeixos() +
//                        "\nPropulsão: " + car_1.getPropulsao() +
//                        "\nMarca: " + car_1.getMarca() +
//                        "\nModelo: " + car_1.getModelo() +
//                        "\nCapacidade do Porta malas: " + car_1.getCapacidadePortaMalas()
//                );

        Caminhao truck_1 = new Caminhao(3,"Diesel","Ford","F-350",2015,20000);
        Caminhao truck_2 = new Caminhao(4,"Diesel","Ford","F-4000",2017,25000);
        Caminhao truck_3 = new Caminhao(5,"Diesel","Ford","Cargo 1119",2020,30000);
        Caminhao truck_4 = new Caminhao(6,"Diesel","Ford","F-350",2021,40000);
        Caminhao truck_5 = new Caminhao(4,"Diesel","Mercedez","Accelo",2022,50000);


        List<Veiculo> veiculosList = new ArrayList<>();
        veiculosList.add(bike_1);
        veiculosList.add(bike_2);
        veiculosList.add(bike_3);
        veiculosList.add(bike_4);
        veiculosList.add(bike_5);

        veiculosList.add(car_1);
        veiculosList.add(car_2);
        veiculosList.add(car_3);
        veiculosList.add(car_4);
        veiculosList.add(car_5);

        veiculosList.add(truck_1);
        veiculosList.add(truck_2);
        veiculosList.add(truck_3);
        veiculosList.add(truck_4);
        veiculosList.add(truck_5);

        System.out.println(veiculosList.stream().sorted(Comparator.comparing(Veiculo::getAnoFrabricacao)).collect(Collectors.toList()));


//        System.out.println(
//                "\nNumero de eixos: " + truck_1.getNumeroDeeixos() +
//                        "\nPropulsão: " + truck_1.getPropulsao() +
//                        "\nMarca: " + truck_1.getMarca() +
//                        "\nModelo: " + truck_1.getModelo() +
//                        "\nCapacidade de Carga: " + truck_1.getCapacidadeDeCarga()
//        );
    }
}