import java.math.BigDecimal;

public class MVC_Model {
    private BigDecimal result;
    private final ResponseType respType;

    public MVC_Model(ResponseType respType) {
        this.respType = respType;
    }

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    public ResponseType getRespType() {
        return respType;
    }
}
