package com.omshinde.actions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Lombok annotations to generate boilerplate code like getters, setters, constructors, etc.
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SearchContent {
    private String input;  // Field to hold the search text

    // Method to create a SearchContent instance with a predefined search term
    public SearchContent search() {
        return SearchContent.builder()
                .input("Selenium")  // Sets the search text to "Selenium"
                .build();  // Builds and returns the SearchContent instance
    }
}
