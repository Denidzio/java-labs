package edu.lunhu.taxi.service;

import edu.lunhu.taxi.entity.Order;
import edu.lunhu.taxi.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    public Order getOne(Long id) {
        var order = orderRepository.findById(id);
        return order.isEmpty() ? null : order.get();
    }

    public Order create(Order order) {
        return orderRepository.save(order);
    }

    public Order update(Long id, Order order) {
        order.setId(id);
        return orderRepository.save(order);
    }

    public Order delete(Long id) {
        var order = getOne(id);
        orderRepository.deleteById(id);
        return order;
    }

}
