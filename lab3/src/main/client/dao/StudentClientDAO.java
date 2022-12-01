package main.client.dao;

import main.client.entity.Student;
import main.client.entity.user.User;

import java.util.List;

public interface StudentClientDAO {

    boolean edit(Student newValue);

    List<Student> getAll();

    Student get(int id);

    boolean create(Student item);

    User register(User user);

    User login(User user);
}
