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
@Table(name = "teachers")
public class Teacher {

    @Id
	@JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	@JsonProperty("name")
    @Column(name = "name", nullable = false)
	private String name;

	@JsonProperty("formation")
    @Column(name = "formation", nullable = false)
	private String formation;
	
	@JsonProperty("registration")
    @Column(name = "registration", nullable = false, unique = true)
	private long registration;

	@JsonProperty("email")
	@Column(name = "email", nullable = false, unique = true)
	private String email;

	public Teacher(){}

	public Teacher(String name, long registration, String email, String formation) {
		this.name = name;
		this.registration = registration;
		this.email = email;
		this.formation = formation;
	}
 
}
