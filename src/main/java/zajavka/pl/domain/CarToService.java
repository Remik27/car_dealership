package zajavka.pl.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "car_to_service")
public class CarToService {
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

    @OneToMany(mappedBy = "carToService")
    private Set<CarServiceRequest> carServiceRequests;
}

