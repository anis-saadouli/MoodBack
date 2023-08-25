package mood.sof.humeur.Exeption;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message)  {
        super(message);
    }
}