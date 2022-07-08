package mx.com.example.services.service;

import mx.com.example.commons.to.UserTO;
import mx.com.example.services.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class PaymentServiceTest extends BaseTest {

    @Test
    public void exampleTest() {

        List<UserTO> users = this.paymentService.getUsers();

        Assert.assertEquals(1, users.size());
    }
}
