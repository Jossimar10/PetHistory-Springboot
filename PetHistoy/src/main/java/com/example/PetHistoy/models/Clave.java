package com.example.PetHistoy.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
public class Clave {

    @Id
    @Column(name = "User", length = 50, nullable = false)
    private String user;

    @Column(name = "Contra", nullable = false)
    private Long contra;

}
