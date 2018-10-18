package com.example.d2a.movie;

import java.io.Serializable;

public class Movie{
    String nama;
    Double rating;
    String status;
    public Movie(String nama, Double Rating, String status) {
        this.nama = nama;
        this.rating = Rating;
        this.status = status;
    }
}
