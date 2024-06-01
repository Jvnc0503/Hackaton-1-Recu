package com.example.demo.artista.domain;

import lombok.Data;

@Entity
@Data
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idArtist;

    private String nombre;
}
