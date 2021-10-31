package pl.restaurantmanagementsystem.rms.exceptions;

import lombok.Getter;

@Getter
public enum ExceptionReason {

    NO_QUANTITY_CHOSEN("Wybierz ilość!"),
    NO_SIZE_CHOSEN("Wybierz wielkość pizzy!"),
    NO_DOUGH_CHOSEN("Wybierz ciasto!"),
    NO_SAUCE_CHOSEN("Wybierz sos!");
    private String messageTemplate;

    ExceptionReason(String messageTemplate) {
        this.messageTemplate = messageTemplate;
    }
}
