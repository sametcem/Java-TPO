
public enum ResponseType {
    OK("ok"),
    MISSING_PARAMETER("missingParamError"),
    NAN_PARAMETER("nanParamError");

    public String name;

    ResponseType(String name) {
        this.name = name;
    }
}
