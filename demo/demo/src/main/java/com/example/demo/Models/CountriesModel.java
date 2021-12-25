package com.example.demo.Models;

import javax.persistence.*;

import org.bson.json.JsonObject;

import lombok.Data;

@Table(name="countries")
public @Data class CountriesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true, length = 70)
    private String name;

    @Column(nullable = false, unique = true, length = 70)
    private String englishName;

    @Column(nullable = false, unique = true, length = 150)
    private String flag;

    @Column(nullable = false, unique = true, length = 70)
    private String capital;

    @Column(nullable = false, unique = true, length = 70)
    private String [] coordinates;

    @Column(nullable = false, unique = true, length = 70)
    private JsonObject countryCodes;

    @Column(nullable = false, unique = true, length = 70)
    private String [] callCode;

    
}
