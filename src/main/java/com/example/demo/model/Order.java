package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data

public class Order {
    @Id
    @SequenceGenerator(name = "order_seq",
            sequenceName = "order_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "order_seq")
    private Long id;
    private String name;
    private double total;

    @OneToMany(mappedBy = "idOrder")
    private List<DetalleOrder> detalles;
}
