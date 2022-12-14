package main.client.presentation.viewModel;

import main.client.entity.Student;
import main.client.service.StudentClientService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EditModelView extends PresentationModel {
    private final int id;

    public EditModelView(StudentClientService studentService, int id) {
        super(studentService);
        this.id = id;
    }

    @Override
    public List<Student> getItems() {
        Student result = this.studentService.get(this.id);
        return result == null ? new ArrayList<>()
                : Collections.singletonList(result);
    }
}
