package br.com.rafaela.javaspringatv2.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
	private String name;
	
    @Column(name = "registration", unique = true)
	private long registration;
	
    @Column(name = "email", unique = true)
    private String email;

    public Student(String name, long registration, String email) {
        this.name = name;
        this.registration = registration;
        this.email = email;
    }
}
