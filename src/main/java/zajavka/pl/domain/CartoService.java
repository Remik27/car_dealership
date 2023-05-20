package zajavka.pl.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "car_to_service")
public class CartoService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_to_service_id")
    private Integer carToServiceID;

    @Column(name = "vin")
    private String vin;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "year")
    private Short year;
}

