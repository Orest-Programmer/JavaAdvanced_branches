package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.dao.IUniversityRepository;
import spring.doMain.University;
import spring.service.iface.IUniversityService;

import java.util.List;

@Service
public class UniversityServiceImpl implements IUniversityService {

    @Autowired
    private IUniversityRepository universityRepository;


    @Override
    public University create(University university) {
        return universityRepository.save(university);
    }

    @Override
    public void deleteById(int id) {
        universityRepository.deleteById(id);
    }

    @Override
    public University update(University university) {
        return universityRepository.save(university);
    }

    @Override
    public University findById(int id) {
        return universityRepository.getById(id);
    }

    @Override
    public List<University> createAll(List<University> universitiesList) {
        return universityRepository.saveAll(universitiesList);
    }

    @Override
    public List<University> findByCountOfStudents(int countOfStudents) {
        return universityRepository.findByCountOfStudents(countOfStudents);
    }

    @Override
    public List<University> findAll() {
        return universityRepository.findAll();
    }

    @Override
    public University findByName(String name) {
        return universityRepository.findByName(name);
    }
}
