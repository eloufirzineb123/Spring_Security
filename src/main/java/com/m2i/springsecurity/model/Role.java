package com.m2i.springsecurity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author elouf
 */
@NoArgsConstructor
@Data
@Entity
@Table(name="roles")
public class Role {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column 
    private String name;

    public Role(String name) {
        this.name = name;
    }
    
    
    
    
}
