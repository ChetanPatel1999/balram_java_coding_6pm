package Exception;

public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException(String msg) {
        super(msg);
    }

    String myMsg() {
        return "invalid age ";
    }

}
