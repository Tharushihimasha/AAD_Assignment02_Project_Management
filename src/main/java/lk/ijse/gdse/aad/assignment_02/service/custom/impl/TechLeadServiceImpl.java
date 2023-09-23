package lk.ijse.gdse.aad.assignment_02.service.impl;

import lk.ijse.gdse.aad.assignment_02.dto.TechLeadDTO;
import lk.ijse.gdse.aad.assignment_02.entity.TechLeadEntity;
import lk.ijse.gdse.aad.assignment_02.service.TechLeadService;
import lk.ijse.gdse.aad.assignment_02.util.Convertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TechLeadServiceImpl implements TechLeadService {

    @Autowired
    TechLeadRepo techLeadRepository;

    @Autowired
    Convertor convertor;

    @Override
    public List<TechLeadDTO> findAll() {
        List<TechLeadDTO> list = new ArrayList<>();
        for (TechLeadEntity techLeadEntity : techLeadRepository.findAll()) {
            list.add(convertor.toTechLeadDTO(techLeadEntity));
        }

        return list;
    }

    @Override
    public TechLeadDTO getById(Integer id) {
        return convertor.toTechLeadDTO(techLeadRepository.getById(id));
    }

    @Override
    public <S extends TechLeadDTO> S save(S entity) {
        return (S) convertor.toTechLeadDTO(techLeadRepository.save(convertor.toTechLeadEntity(entity)));

    }

    @Override
    public long count() {
        return techLeadRepository.count();
    }

    @Override
    public void deleteById(Integer id) {
        techLeadRepository.deleteById(id);
    }

    @Override
    public void updateProject(Integer id, String name, String contactNo, byte[] photo) {
        techLeadRepository.updateTechLeadById(id,name,contactNo,photo);
    }
}
