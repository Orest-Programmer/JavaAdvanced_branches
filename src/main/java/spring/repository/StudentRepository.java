package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
