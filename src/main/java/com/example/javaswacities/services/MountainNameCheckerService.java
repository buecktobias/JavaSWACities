package com.example.javaswacities.services;

import com.example.javaswacities.model.Mountain;
import org.springframework.stereotype.Service;

@lombok.AllArgsConstructor
@Service
public class MountainNameCheckerService {

    public boolean mountainNameContainsCaseInsensitive(Mountain mountain1, String searchString){
        final var mountainUppercaseName = mountain1.getName().toUpperCase();
        final var uppercaseSearchString = searchString.toUpperCase();
        return mountainUppercaseName.contains(uppercaseSearchString);
    }

}
