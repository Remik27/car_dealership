package zajavka.pl.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "mechanic")
public class Mechanic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mechanic_id")
    private Integer mechanicID;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "pesel")
    private String pesel;

    @OneToMany(mappedBy = "mechanic")
    private Set<ServiceMechanic> serviceMechanics;
}
