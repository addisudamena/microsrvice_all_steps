package com.hibenettest.business;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Lonly {
    @Id
    @GeneratedValue
    int id;
    String name;

}
