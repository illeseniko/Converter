package hu.progmatic.converter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Currency {
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String abbreviation;



}
