package main.client.service;

import main.client.entity.Student;
import main.client.entity.user.User;

import java.util.List;

public interface StudentClientService {

    boolean edit(Student newValue);

    List<Student> getAll();

    Student get(int id);

    boolean create(Student student);

    User register(User user);

    User login(User user);
}
