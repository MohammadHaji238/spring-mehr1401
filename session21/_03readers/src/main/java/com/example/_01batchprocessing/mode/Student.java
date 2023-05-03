package com.example._01batchprocessing.mode;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;
}
