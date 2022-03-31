package edu.lunhu.taxi.utils;

import edu.lunhu.taxi.dto.ClientOrderDto;
import edu.lunhu.taxi.entity.Car;
import edu.lunhu.taxi.entity.Driver;
import edu.lunhu.taxi.entity.Order;
import edu.lunhu.taxi.entity.Tariff;
import org.springframework.stereotype.Service;

@Service
public class MappingUtils {

    public ClientOrderDto mapToClientOrderDto(Order order) {
        var clientOrderDto = new ClientOrderDto();

        clientOrderDto.setId(order.getId());
        clientOrderDto.setDriverName(order.getDriver().getFullName());
        clientOrderDto.setCarModel(order.getDriver().getCar().getModel());
        clientOrderDto.setTariffName(order.getTariff().getName());
        clientOrderDto.setWaitingTime(order.getWaitingTime());
        clientOrderDto.setPrice(order.getPrice());

        return clientOrderDto;
    }

    public Order mapToOrder(ClientOrderDto clientOrderDto) {
        var car = new Car();
        car.setModel(clientOrderDto.getCarModel());

        var driver = new Driver();
        driver.setFullName(clientOrderDto.getDriverName());
        driver.setCar(car);

        var tariff = new Tariff();
        tariff.setName(clientOrderDto.getTariffName());

        var order = new Order();
        order.setDriver(driver);
        order.setTariff(tariff);
        order.setWaitingTime(clientOrderDto.getWaitingTime());
        order.setPrice(clientOrderDto.getPrice());

        return order;
    }

}
