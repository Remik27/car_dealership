package zajavka.pl.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.OffsetDateTime;

@Entity
@Data
@Table(name = "invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_id")
    private Integer invoiceID;

    @Column(name = "invoice_number")
    private String invoiceNumber;

    @Column(name = "date_time")
    private OffsetDateTime dateTime;

    @Column(name = "car_to_buy_id")
    private Integer carToBuyID;

    @Column(name = "customer_id")
    private Integer customerID;

    @Column(name = "salesman_id")
    private Integer salesmanID;
}
