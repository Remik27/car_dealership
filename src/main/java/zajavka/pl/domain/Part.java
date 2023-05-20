package zajavka.pl.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@Table(name = "part")
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "part_id")
    private Integer partID;

    @Column(name = "serial_number")
    private String serialNumber;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

}
