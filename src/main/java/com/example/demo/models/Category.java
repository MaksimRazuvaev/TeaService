//This is db analog. We set up methods to work with variables from db.
// to use it in the package "repositories" in "row mapper".


package com.example.demo.models;

import lombok.Builder;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;
// lombok have to be upload to the xml file (set up "dependency")

@Getter
@Setter
@Builder
@ToString
public class Category {
    private Long id;
    private String categoryName;

}
