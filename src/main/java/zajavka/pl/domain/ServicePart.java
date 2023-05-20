package zajavka.pl.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "service_part")
public class ServicePart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_part_id")
    private Integer servicePartID;
            @Column(name = "quantity")
            private Integer quantity;

    @Column(name = "car_service_request_id")
    private Integer carServiceRequestID;

    @Column(name = "part_id")
    private Integer partID;
}
