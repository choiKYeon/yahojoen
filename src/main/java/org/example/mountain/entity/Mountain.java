package org.example.mountain.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mountain {
    private String name;
    private String features;
    private String course;
    public Mountain(String name, String features, String course){
        this.name = name;
        this.features = features;
        this.course = course;
    }
}
