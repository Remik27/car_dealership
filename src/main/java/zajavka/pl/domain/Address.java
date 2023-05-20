package zajavka.pl.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "address")
@Data

public class Address {
    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressID;

    @Column(name = "country")
    private String country;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

}
