package br.com.rafaela.javaspringatv2.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private long id;
    
    @JsonProperty("name")
    @Column(name = "name")
	private String name;
	
    @JsonProperty("registration")
    @Column(name = "registration", unique = true)
	private long registration;
	
    @JsonProperty("email")
    @Column(name = "email", unique = true)
    private String email;

	public Student(){}

    public Student(String name, long registration, String email) {
        this.name = name;
        this.registration = registration;
        this.email = email;
    }
}
