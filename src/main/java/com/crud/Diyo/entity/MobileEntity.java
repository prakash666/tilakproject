package com.crud.Diyo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.swing.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class MobileEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank (message = "please enter name")
    private String name;
    @NotBlank (message = "please enter type")
    private String type;
    @NotBlank (message = "please enter price")
    private String price;
    @NotBlank (message = "please enter color")
    private String color;
}
