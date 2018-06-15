package com.test.springbootrestswagger.student;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentResource {

	/*@Autowired
	private StudentRepository studentRepository;*/
	StudentDetailRepository studentDetailRepository = new StudentDetailRepository();
	@GetMapping("/students")
	public List<Student> retrieveAllStudents() {
		return studentDetailRepository.sStudents();
	}

	/*@GetMapping("/students/{id}")
	@ApiOperation(value = "Find student by id",
    notes = "Also returns a link to retrieve all students with rel - all-students")
	public Resource<Student> retrieveStudent(@PathVariable long id) {
		
		Optional<Student> student = studentRepository.findById(id);

		if (!student.isPresent())
			throw new StudentNotFoundException("id-" + id);

		Resource<Student> resource = new Resource<Student>(student.get());

		ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllStudents());

		resource.add(linkTo.withRel("all-students"));

		return resource;
	}

	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable long id) {
		studentRepository.deleteById(id);
	}

	@PostMapping("/students")
	public ResponseEntity<Object> createStudent(@RequestBody Student student) {
		Student savedStudent = studentRepository.save(student);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedStudent.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@PutMapping("/students/{id}")
	public ResponseEntity<Object> updateStudent(@RequestBody Student student, @PathVariable long id) {

		Optional<Student> studentOptional = studentRepository.findById(id);

		if (!studentOptional.isPresent())
			return ResponseEntity.notFound().build();

		student.setId(id);
		
		studentRepository.save(student);

		return ResponseEntity.noContent().build();
	}*/
}
