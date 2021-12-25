package com.example.demo.Models;

import javax.persistence.*;

import lombok.Data;

public @Data class ProvincesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idprovinces;

    @Column(name="name", nullable = false, unique = true, length = 70)
    private String name;

    @Column(name="flag", nullable = false, unique = true, length = 150)
    private String flag;

    @Column(name="capital", nullable = false, unique = true, length = 70)
    private String capital;

    @Column(name="coordinates", nullable = false, unique = true, length = 70)
    private String [] coordinates;

    @Column(name="callCode", nullable = false, unique = true, length = 70)
    private String [] callCode;

    @Column(name="englishName", nullable = false, unique = true, length = 70)
    private String englishName;

    @Column(name="idpaises", nullable = false, unique = true, length = 70)
    private int idpaises;



}
