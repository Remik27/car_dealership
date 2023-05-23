package zajavka.pl.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Data
@Table(name = "car_to_buy")
public class CarToBuy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_to_buy_id")
    private Integer carToBuyID;

    @Column(name = "vin")
    private String vin;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "year")
    private Short year;

    @Column(name = "color")
    private String color;

    @Column(name = "price")
    private BigDecimal price;

    @OneToMany(mappedBy = "car_to_buy")
    private Set<Salesman> salesmans;
}
