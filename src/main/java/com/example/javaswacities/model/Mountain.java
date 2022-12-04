package com.example.javaswacities.model;

import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.RequiredArgsConstructor
@lombok.ToString
@lombok.EqualsAndHashCode
public class Mountain {
    @Id
    private String Name;
    @Nullable
    private String Mountains;
    private Double Height;
    private String Type;
    private Double Longitude;
    private Double Latitude;
}
