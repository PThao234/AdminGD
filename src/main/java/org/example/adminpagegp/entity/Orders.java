package org.example.adminpagegp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_orders")
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;
    @Column(name = "product_id")
    Integer productId;
    @Column(name = "quantity")
    Integer quantity;
    @Column(name = "description")
    String description;
    @Column(name = "status")
    Integer status;
    @Column(name = "created_at")
    LocalDate createdAt = LocalDate.now();
    @Column(name = "updated_at")
    LocalDate updatedAt;
    @Column(name = "created_by")
    String createdBy;
    @Column(name = "updated_by")
    String updatedBy;
}
