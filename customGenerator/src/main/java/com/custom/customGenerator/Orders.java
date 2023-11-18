package com.custom.customGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "order_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
    @Id
    @Column(name = "ORDER_ID")
    @GenericGenerator(name = "order_id_gen" , strategy = "com.custom.customGenerator.CustomIdGenerator")
    @GeneratedValue(generator = "order_id_gen")
    private String orderId ;
    @Column(name = "ORDER_BY")
    private String orderBy;
    @Column(name = "ORDER_PLACED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderPlacedDate;

    Orders(String orderBy) {
        this.orderBy = orderBy;
        this.orderPlacedDate = new Date();
    }
}
