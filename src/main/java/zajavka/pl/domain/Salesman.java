package zajavka.pl.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "salesman")
public class Salesman {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salesman_id")
    private Integer salesmanID;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "pesel")
    private String pesel;
}
