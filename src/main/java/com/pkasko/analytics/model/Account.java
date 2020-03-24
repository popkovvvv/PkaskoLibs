package com.pkasko.analytics.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Account {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false)
    private String fullName;
    private BigDecimal balance;
    private boolean isCanTransfer;
    @Column(unique = true, nullable = false)
    private Integer number;
}
