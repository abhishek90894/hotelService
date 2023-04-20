package com.hotelService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    private String id;
    @Column(name = "hotel_name",length = 100)
    private String name;
    @Column(name = "hotel_location",length = 100)
    private String location;
    @Column(length = 500)
    private String about;
}
