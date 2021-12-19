package br.com.rafaela.javaspringatv2.controller;
import java.util.List;
import java.util.Optional;

import br.com.rafaela.javaspringatv2.domain.Class;
import br.com.rafaela.javaspringatv2.domain.Teacher;
import br.com.rafaela.javaspringatv2.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/classes")
public class ClassController {

    @Autowired
    private ClassRepository classRepository;

    @GetMapping
    public List<Class> getClasss() {
        return classRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Class> getClassById(@PathVariable Long id) {
        return classRepository.findById(id);
    }

    @PostMapping
	public Class createClass(@RequestBody Class Class) {
		return classRepository.save(Class);
	}
	
    @PatchMapping("/{id}/register-teacher/{idTeacher}")
    public Class registerTeacher(@PathVariable("id") Long id, @PathVariable("idTeacher") Long idTeacher) {
        System.out.print("olaa" + id);
        
        Class classEntity = classRepository.getById(id);
        System.out.print("olaa" + classEntity);
        classEntity.setIdTeacher(idTeacher);

        
        return classRepository.save(classEntity);
    }
 
    @PutMapping("/{id}")
    public Class updateClass(@PathVariable("id") Long id, @RequestBody Class Class) {
        return classRepository.save(Class);
    }

    @DeleteMapping("/{id}")
    public void deleteClass(@PathVariable Long id) {
        classRepository.delete(classRepository.findById(id).get());
    } 
}