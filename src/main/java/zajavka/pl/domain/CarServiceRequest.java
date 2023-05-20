package zajavka.pl.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.OffsetDateTime;

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

    @Column(name = "customer_id")
    private Integer customerID;

    @Column(name = "car_to_service_id")
    private Integer carToServiceID;
}
