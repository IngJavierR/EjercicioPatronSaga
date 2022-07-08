package mx.com.example.services.facade;

import mx.com.example.commons.to.OrderEventTO;
import mx.com.example.commons.to.OrderTO;
import mx.com.example.commons.to.PaymentEventTO;
import mx.com.example.commons.to.UserTO;

import java.util.List;

public interface IOrderFacade {

    List<UserTO> getAllUsers();
    OrderEventTO createOrder(OrderTO order);
    void approveOrder(PaymentEventTO payment);
}
