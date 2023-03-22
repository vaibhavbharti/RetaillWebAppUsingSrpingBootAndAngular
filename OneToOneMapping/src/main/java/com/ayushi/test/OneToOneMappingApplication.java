package com.ayushi.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ayushi.test.model.Instructor;
import com.ayushi.test.model.InstructorDetail;
import com.ayushi.test.repository.InstructorRepository;

@SpringBootApplication
public class OneToOneMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneMappingApplication.class, args);
	}
	
	 @Autowired
	    private InstructorRepository instructorRepository;

	    @Override
	    public void run(String...args) throws Exception {

	        Instructor instructor = new Instructor("Ramesh", "Fadatare", "ramesh@gmail.com");

	        InstructorDetail instructorDetail = new InstructorDetail("Java Guides", "Cricket Playing");

	        // associate the objects
	        instructor.setInstructorDetail(instructorDetail);

	        instructorRepository.save(instructor);
	    }
	}

}
