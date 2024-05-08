package org.example.adminpagegp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    String id;
    @Column(name = "name")
    String name;
    @Column(name = "avatar")
    String avatar;
    @Column(name = "price")
    Float price;
    @Column(name = "sale_price")
    Float salePrice;
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

    @Column(name = "category_id")
    String categoryId;
}
