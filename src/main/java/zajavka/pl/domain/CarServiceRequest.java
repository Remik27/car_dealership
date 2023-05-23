package zajavka.pl.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.Set;

@Entity
@Table(name = "car_service_request")
@Data
public class CarServiceRequest {

    @Id
    @Column(name = "car_service_request_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer carServiceRequestID;

    @Column(name = "car_service_request_number")
    private Integer carServiceRequestNumber;

    @Column(name = "received_date_time")
    private OffsetDateTime receivedDateTime;

    @Column(name = "completed_date_time")
    private OffsetDateTime completedDateTime;

    @Column(name = "customer_comment")
    private String customerComment;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "car_to_service_id")
    private CarToService carToService;

    @ManyToMany()
    @JoinTable(
            name = "service_part",
            joinColumns = @JoinColumn(name ="car_service_request_id"),
            inverseJoinColumns = @JoinColumn(name = "part_id")
    )
    private Set<Part> parts;

    @OneToMany(mappedBy = "carServiceRequest")
    private Set<ServiceMechanic> serviceMechanics;
}
