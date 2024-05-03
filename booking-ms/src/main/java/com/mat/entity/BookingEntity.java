package com.mat.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "booking")
public class BookingEntity {
    @Id
    private Number id;
    private String name;
    private String description;
}
