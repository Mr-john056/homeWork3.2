package sky.pro.homeWork32.service;

import org.springframework.stereotype.Service;
import sky.pro.homeWork32.entities.Student;

@Service
public interface StudentService {

    Student addStudent(Student student);

    Student findStudent(long id);

    Student editStudent(long id, Student student);

    void deleteStudent(long id);
}
