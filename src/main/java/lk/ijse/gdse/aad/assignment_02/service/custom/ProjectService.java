package lk.ijse.gdse.aad.assignment_02.service;

import lk.ijse.gdse.aad.assignment_02.dto.ProjectDTO;

import java.util.Date;

public interface ProjectService extends SuperService<ProjectDTO>{

    void updateProject(Integer code, String title, String description, Date startDate);

}
