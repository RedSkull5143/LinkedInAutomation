package com.omshinde.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String username;
    private String password;

    public User user1(){
        return User.builder()
                .username("dummyUsername")
                .password("dummyPassword")
                .build();
    }
}
