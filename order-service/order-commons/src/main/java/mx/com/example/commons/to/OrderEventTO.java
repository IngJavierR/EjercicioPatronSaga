package mx.com.example.commons.to;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderEventTO extends EventBase {

    private String description;
    private int quantity;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
