package zajavka.pl.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer customerID;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id", unique = true)
    private Address address;

    @OneToMany(mappedBy = "customer")
    private Set<Invoice> invoices;

    @OneToMany(mappedBy = "customer")
    private Set<CarServiceRequest> carServiceRequests;
}
