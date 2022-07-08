package mx.com.example.persistence;

import mx.com.example.model.KitchenDO;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface KitchenDAO extends CrudRepository<KitchenDO, Long> {

    @Transactional
    @Modifying
    @Query("update KitchenDO k set k.status = ?1 where k.uuid = ?2")
    int setStatusForKitchenDO(String status, String uuid);

}
