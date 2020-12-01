package dk.userreview;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Review {
    @Id
    private String id;
    @NonNull String username;
    @NonNull int carId;
    @NonNull int rating;
}
