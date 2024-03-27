package ru.itis.spring_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ru.itis.spring_lab.model.Car;
import ru.itis.spring_lab.model.CarWash;
import ru.itis.spring_lab.model.Client;
import ru.itis.spring_lab.repository.CarRepository;
import ru.itis.spring_lab.repository.CarWashRepository;
import ru.itis.spring_lab.repository.ClientRepository;

import java.util.List;

@Component
public class Main implements Runnable{
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private CarWashRepository carWashRepository;
    @Override
    public void run() {
        Car car = new Car();
        car.setCarNumber("О979НН 716");
        carRepository.save(car);
        System.out.println(car.getId());


        Client client = new Client();
        client.setName("Клиент 1");
        client.setCar(List.of(car));
        clientRepository.save(client);
        System.out.println(client.getId());

        CarWash carWash = new CarWash();
        carWash.setName("Moy-bro");
        carWashRepository.save(carWash);



    }
}
