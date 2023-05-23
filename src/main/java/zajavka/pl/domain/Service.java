package zajavka.pl.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Data
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private Integer serviceID;

    @Column(name = "service_code")
    private String serviceCode;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @OneToMany(mappedBy = "service")
    private Set<ServiceMechanic> serviceMechanics;

}
