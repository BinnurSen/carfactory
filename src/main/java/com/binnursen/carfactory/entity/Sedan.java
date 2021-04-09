package com.binnursen.carfactory.entity;

import com.binnursen.carfactory.repository.CarInterface;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Sedan implements CarInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Override
    public String getType() {
        return "Sedan Car has produced.";
    }
}
