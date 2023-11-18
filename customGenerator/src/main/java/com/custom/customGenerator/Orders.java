package com.custom.customGenerator;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "order_details")
@Data
public class Orders {
    @Id
    @Column(name = "ORDER_ID")
    @GenericGenerator(name = "order_id_gen" , strategy = "com.custom.customGenerator.CustomIdGenerator")
    @GeneratedValue(generator = "order_id_gen")
    private String orderId ;
    @Column(name = "ORDER_BY")
    private String orderBy;
    @Column(name = "ORDER_PLACED_DATE")
    private Date orderPlacedDate;
}
