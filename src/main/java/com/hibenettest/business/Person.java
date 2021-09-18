package com.hibenettest.business;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Person {
    @Id
    @GeneratedValue
    int id;
    String name;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER) // <- Not good use Hibernate.initalize
    @JoinColumn
    Set<Relative> relatives= new HashSet<>();

    public void addRelative(Relative relative){
        if(relative!=null)
            relatives.add(relative);
    }
}
