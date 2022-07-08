package mx.com.example.commons.to;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentEventTO extends EventBase {

    private String description;
    private String comfirmCode;
    private int status;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComfirmCode() {
        return comfirmCode;
    }

    public void setComfirmCode(String comfirmCode) {
        this.comfirmCode = comfirmCode;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
