package br.com.rafaela.javaspringatv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rafaela.javaspringatv2.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {}