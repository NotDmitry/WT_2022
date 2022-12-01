package main.client.presentation.viewModel;

import main.client.entity.Student;
import main.client.service.StudentClientService;

import java.util.List;

public abstract class PresentationModel {
    protected StudentClientService studentService;
    public PresentationModel(StudentClientService studentService) {
        this.studentService = studentService;
    }

    public abstract List<Student> getItems();
}
