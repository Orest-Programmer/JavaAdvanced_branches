package spring.configuration;

import spring.dao.StudentDaoImpl;
import spring.dao.inerface.IStudentDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudDaoConfiguration {

    @Bean
    IStudentDao studentDao() {
        return new StudentDaoImpl();
    }
}
