package com.omshinde.actions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Lombok annotations to generate boilerplate code like getters, setters, constructors, etc.
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentAction {
    private String input;  // Field to hold the comment text

    // Method to create a CommentAction instance with a predefined comment
    public CommentAction comment() {
        return CommentAction.builder()
                .input("Informative")  // Sets the comment text to "Informative"
                .build();  // Builds and returns the CommentAction instance
    }
}
