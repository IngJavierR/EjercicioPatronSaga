package mx.com.example.persistence;

import mx.com.example.model.OrderDO;
import mx.com.example.model.UserDO;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OrderDAO extends CrudRepository<OrderDO, Long> {

    @Transactional
    @Modifying
    @Query("update OrderDO k set k.status = ?1 where k.uuid = ?2")
    int setStatusForOrderDO(String status, String uuid);
}
