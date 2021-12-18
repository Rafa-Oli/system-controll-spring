package br.com.rafaela.javaspringatv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rafaela.javaspringatv2.domain.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {}