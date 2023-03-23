package Creational.Builder;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder  //impleteaza in spate ce am faceut mai evreme

public class Dog {
    private String name;
    private String type;
    private Integer age;
    private List<String> toys;


}
