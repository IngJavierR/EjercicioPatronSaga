package mx.com.example.services.facade.impl;

import mx.com.example.commons.to.OrderEventTO;
import mx.com.example.commons.to.PaymentEventTO;
import mx.com.example.commons.to.TicketEventTO;
import mx.com.example.commons.to.UserTO;
import mx.com.example.model.KitchenDO;
import mx.com.example.persistence.KitchenDAO;
import mx.com.example.services.facade.IKitchenFacade;
import mx.com.example.services.service.IKitchenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class KitchenFacade implements IKitchenFacade {

    @Autowired
    private IKitchenService kitchenService;

    @Autowired
    private KitchenDAO kitchenDAO;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public List<UserTO> getAllUsers() {
        return this.kitchenService.getUsers();
    }

    @Override
    public TicketEventTO createTicket(OrderEventTO order) {

        Date date = new Date();

        KitchenDO kitchenDO = new KitchenDO();
        

        TicketEventTO ticketEvent = new TicketEventTO();
        

        //kafkaTemplate.send("ticket_events", ticketEvent);
        return ticketEvent;
    }

    @Override
    public void approveTicket(PaymentEventTO payment) {
        
    }
}
