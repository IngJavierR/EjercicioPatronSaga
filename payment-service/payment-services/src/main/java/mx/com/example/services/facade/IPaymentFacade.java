package mx.com.example.services.facade;

import mx.com.example.commons.to.PaymentEventTO;
import mx.com.example.commons.to.TicketEventTO;
import mx.com.example.commons.to.UserTO;

import java.util.List;

public interface IPaymentFacade {

    List<UserTO> getAllUsers();

    PaymentEventTO authorizeCard(TicketEventTO ticketEvent);
}
