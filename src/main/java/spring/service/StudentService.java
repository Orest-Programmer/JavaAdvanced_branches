package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import spring.models.Student;
import spring.repository.StudentRepository;

import java.io.IOException;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student create(Student student, MultipartFile file) throws IOException {
        student.setFileName(StringUtils.cleanPath(file.getOriginalFilename()));
        student.setFileType(file.getContentType());
        student.setFiledata(file.getBytes());

        return studentRepository.save(student);
    }

    public Student findById(int id) {
        return studentRepository.getById(id);
    }
}