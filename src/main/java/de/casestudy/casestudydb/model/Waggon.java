package de.casestudy.casestudydb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Waggon {
    private int number;
    private Sections sections;
}
