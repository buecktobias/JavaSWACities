package com.example.javaswacities.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.RequiredArgsConstructor
@lombok.ToString
public class Mountain {
    @Id
    private String Name;
    private String Mountains;
    private Float Height;
    private String Type;
    private String Longitude;
    private String Latitude;
}
