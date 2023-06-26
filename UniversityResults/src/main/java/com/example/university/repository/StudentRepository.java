package com.example.university.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.example.university.model.Student;

@EnableMongoRepositories
public interface StudentRepository extends MongoRepository<Student, String>{
	
}
