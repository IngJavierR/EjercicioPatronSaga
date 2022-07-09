package mx.com.example.services.facade.impl;

import mx.com.example.commons.to.OrderEventTO;
import mx.com.example.commons.to.OrderTO;
import mx.com.example.commons.to.PaymentEventTO;
import mx.com.example.commons.to.UserTO;
import mx.com.example.model.OrderDO;
import mx.com.example.persistence.OrderDAO;
import mx.com.example.services.facade.IOrderFacade;
import mx.com.example.services.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Component
public class OrderFacade implements IOrderFacade {

    @Autowired
    KafkaTemplate kafkaTemplate;

    @Autowired
    private IOrderService orderService;

    @Autowired
    OrderDAO orderDAO;

    public List<UserTO> getAllUsers() {
        return this.orderService.getUsers();
    }

    @Override
    public OrderEventTO createOrder(OrderTO order) {

        String uuid = UUID.randomUUID().toString();
        Date date = new Date();

        OrderEventTO event = new OrderEventTO();
        

        OrderDO orderDO = new OrderDO();
        

        orderDAO.save(orderDO);
        // kafkaTemplate.send("order_events", event);
        return event;
    }

    @Override
    public void approveOrder(PaymentEventTO payment) {
        
    }
}
