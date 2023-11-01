package com.primary.generators;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "PRODUCTS_DATA")
@Data
public class Products {
    @Id
    @Column(name = "ID")
    private Integer id ;
    @Column(name = "NAME")
    private String name ;
    @Column(name = "PRICE" , updatable = false)
    private Double price ;
    @CreationTimestamp
    @Column(name = "UPDATED_DATE" , updatable = false)
    private LocalDateTime updatedDate ;
    @UpdateTimestamp
    @Column(name = "CREATED_DATE", updatable = true)
    private LocalDateTime createdDate ;
}
