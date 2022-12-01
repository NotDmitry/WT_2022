package main.client.service;

import main.client.dao.StudentClientDAO;
import main.client.service.impl.StudentClientServiceImpl;

public class ServiceClientFactory {
    private static final ServiceClientFactory instance = new ServiceClientFactory();

    private ServiceClientFactory() {}

    public StudentClientService getStudentService(StudentClientDAO studentDAO) {

        return new StudentClientServiceImpl(studentDAO);
    }

    public static ServiceClientFactory getInstance() {
        return instance;
    }
}
