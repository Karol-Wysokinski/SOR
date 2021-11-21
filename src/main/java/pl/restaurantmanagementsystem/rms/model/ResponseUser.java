package pl.restaurantmanagementsystem.rms.model;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
public class ResponseUser {
    private String username;
    private int points;
}

