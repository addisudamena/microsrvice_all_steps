package com.hibenettest.business;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Relative {
    @Id
    @GeneratedValue
    int id;
    String relation;

    public Relative(String relation) {
        this.relation = relation;
    }
}
