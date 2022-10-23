package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class DetalleOrder {
    @Id
    @SequenceGenerator(name = "detalle_seq",
            sequenceName = "detalle_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "detalle_seq")
    private Long id;
    private Long idProducto;
    private int count;

    /*
    @ManyToOne
    private Order order;
    */

    private Long idOrder;
}
