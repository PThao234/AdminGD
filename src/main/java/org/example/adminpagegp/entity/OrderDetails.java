package org.example.adminpagegp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_order_details")
@Data
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    String id;
    @Column(name = "code")
    String code;
    @Column(name = "customer_name")
    String customerName;
    @Column(name = "customer_address")
    String customerAddress;
    @Column(name = "customer_email")
    String customerEmail;
    @Column(name = "customer_phone")
    String customerPhone;
    @Column(name = "total")
    Float total;
    @Column(name = "status")
    Integer status;
    @Column(name = "account_id")
    String accountId;
    @Column(name = "created_at")
    LocalDate createdAt = LocalDate.now();
    @Column(name = "updated_at")
    LocalDate updatedAt;
    @Column(name = "created_by")
    String createdBy;
    @Column(name = "updated_by")
    String updatedBy;
}
