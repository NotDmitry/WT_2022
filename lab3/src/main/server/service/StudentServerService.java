package main.server.service;

import main.client.entity.Student;
import main.client.entity.user.User;

import java.util.List;

public interface StudentServerService {

    boolean edit(Student newValue);

    List<Student> getAll();

    Student get(int id);

    boolean create(Student student);

    User login(User user);

    User register(User user);
}
