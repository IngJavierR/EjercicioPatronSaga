package mx.com.example.services.stream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import mx.com.example.commons.to.PaymentEventTO;
import mx.com.example.services.facade.impl.OrderFacade;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    static final Logger LOG = LogManager.getLogger(KafkaListeners.class);

    @Autowired
    private  OrderFacade orderFacade;

    //@KafkaListener(topics = "payment_events", groupId = "order")
    public void listenGroupFoo(String message) throws JsonProcessingException {

        PaymentEventTO payment = new ObjectMapper().readValue(message, PaymentEventTO.class);

        LOG.info("Received Message Payment");
        LOG.info("UUID" + payment.getUuid());
        LOG.info("Description" + payment.getDescription());
        LOG.info("ConfirmCode" + payment.getComfirmCode());
        LOG.info("Time" + payment.getDateTime());
        LOG.info("Status" + payment.getStatus());

        // orderFacade.approveOrder(payment);
    }
}
