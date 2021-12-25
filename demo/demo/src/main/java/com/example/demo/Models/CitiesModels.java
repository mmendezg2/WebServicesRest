package com.example.demo.Models;

import javax.persistence.*;

import org.bson.json.JsonObject;

import lombok.Data;

public @Data class CitiesModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name", nullable = false, unique = true, length = 70)
    private String name;

    @Column(name="englishName",nullable = false, unique = true, length = 70)
    private String englishName;

    @Column(name="flag",nullable = false, unique = true, length = 150)
    private String flag;

    @Column(name="coordinates",nullable = false, unique = true, length = 70)
    private String [] coordinates;

    @Column(name="countryCodes",nullable = false, unique = true, length = 70)
    private JsonObject countryCodes;

    @Column(name="callCode",nullable = false, unique = true, length = 70)
    private String [] callCode;

    @Column(name="idprovinces",nullable = false, unique = true)
    private int idprovinces;

    


}
