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

    @Column(name = "car_service_request_id")
    private Integer carServiceRequestID;

    @Column(name = "mechanic_id")
    private Integer mechanicID;


    @Column(name = "service_id ")
    private Integer serviceID;

}
