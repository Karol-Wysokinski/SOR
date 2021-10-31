package pl.restaurantmanagementsystem.rms.exceptions;

public class SorException extends RuntimeException {

    public SorException(ExceptionReason message) {
        super(message.getMessageTemplate());
    }
}
