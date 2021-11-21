package pl.restaurantmanagementsystem.rms.model;

import lombok.Getter;

@Getter
public enum OrderStatus {
    IN_PREPARATION("Twoje zamówienie jest w trakcie przygotowania"),
    DONE("Twoje zamówienie zostało zrealizowane"),
    CANCELED("Twoje zamówienie zostało anulowane"),
    NOT_EXISTS("Takie zamówienie nie istnieje");

    private String messageTemplate;

    OrderStatus(String messageTemplate) {
        this.messageTemplate = messageTemplate;
    }
}
