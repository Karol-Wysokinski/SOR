package pl.restaurantmanagementsystem.rms.exceptions;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SorErrorResponse {

    private String message;

}
