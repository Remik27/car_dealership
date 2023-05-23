package zajavka.pl.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "service_mechanic")
public class ServiceMechanic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_mechanic_id")
    private Integer serviceMechanicID;

    @Column(name = "hours")
    private Integer hours;

    @Column(name = "comment")
    private String comment;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "car_service_request_id")
    private CarServiceRequest carServiceRequest;

    @ManyToOne()
    @JoinColumn(name = "mechanic_id")
    private Mechanic mechanic;


    @ManyToOne()
    @JoinColumn(name = "service_id")
    private Service service;
}
