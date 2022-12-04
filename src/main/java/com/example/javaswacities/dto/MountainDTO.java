package com.example.javaswacities.dto;

import org.springframework.lang.Nullable;


@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.RequiredArgsConstructor
@lombok.ToString
@lombok.EqualsAndHashCode
public class MountainDTO {
    private String name;
    @Nullable
    private String mountains;
    private String height;
    private String type;
    private String longitude;
    private String latitude;
}
