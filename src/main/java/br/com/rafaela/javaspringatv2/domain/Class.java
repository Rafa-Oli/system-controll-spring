package br.com.rafaela.javaspringatv2.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "classes")
public class Class {

    @Id
    @JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @JsonProperty("name")
    @Column(name = "name")
    private String name;
	
    @JsonProperty("classroom")
    @Column(name = "classroom")
    private String classroom;
    
    @JsonProperty("idTeacher")
    @Column(name = "idTeacher")
    private long idTeacher;
    
    public Class() {}

    public Class(String name, String classroom) {
        this.name = name;
        this.classroom = classroom;
    }
}

