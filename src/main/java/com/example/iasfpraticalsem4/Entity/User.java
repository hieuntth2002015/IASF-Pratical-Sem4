package com.example.iasfpraticalsem4.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "\"user\"")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"user_id\"" )
    private Long id ;
    @Column(name = "\"name\"" )
    private String name  ;
    @Column(name = "\"age\"" )
    private int age ;
    @Column(name = "\"salary\"" )
    private long salary ;
}
