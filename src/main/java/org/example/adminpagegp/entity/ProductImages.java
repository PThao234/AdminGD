package org.example.adminpagegp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_product_images")
@Data
public class ProductImages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    String id;
    @Column(name = "title")
    String title;
    @Column(name = "path")
    String path;
    @Column(name = "status")
    Integer status;
    @Column(name = "product_id")
    String productId;
    @Column(name = "created_at")
    LocalDate createdAt = LocalDate.now();
    @Column(name = "updated_at")
    LocalDate updatedAt;
    @Column(name = "created_by")
    String createdBy;
    @Column(name = "updated_by")
    String updatedBy;
}
