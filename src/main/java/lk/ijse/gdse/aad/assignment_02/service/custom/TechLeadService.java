package lk.ijse.gdse.aad.assignment_02.service;


import lk.ijse.gdse.aad.assignment_02.dto.TechLeadDTO;

public interface TechLeadService extends SuperService<TechLeadDTO> {
    void updateProject(Integer id, String name, String contactNo, byte[] photo);
}
