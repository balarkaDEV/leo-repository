package com.leo.med.hospital.service.business;

import com.leo.med.hospital.service.exception.HospitalServiceBusinessException;
import com.leo.med.hospital.service.model.Contact;
import com.leo.med.hospital.service.model.Hospital;
import com.leo.med.hospital.service.model.HospitalDTO;
import com.leo.med.hospital.service.repository.ContactRepository;
import com.leo.med.hospital.service.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class HospitalServiceBusinessImpl implements HospitalServiceBusiness {

    @Autowired
    private HospitalRepository hospitalRepository;
    @Autowired
    private ContactRepository contactRepository;

    public List<Hospital> findAllHospitals(){
        return Optional.of(hospitalRepository.findAll()).orElseThrow(HospitalServiceBusinessException::new);
    }

    public HospitalDTO save(HospitalDTO hospitalDTO) {
        hospitalDTO.getHospital().setCreatedOn(new Date());
        hospitalDTO.getHospital().setLastModifiedOn(new Date());
        Hospital savedHospital = hospitalRepository.save(hospitalDTO.getHospital());

        List<Contact> savedContacts = new ArrayList<>();
        for(Contact contact : hospitalDTO.getContacts()){
            contact.setHospitalId(savedHospital.getId());
            savedContacts.add(contactRepository.save(contact));
        }

        hospitalDTO.setHospital(savedHospital);
        hospitalDTO.setContacts(savedContacts);

        return hospitalDTO;
    }

    public HospitalDTO findById(long id) {
        Hospital hospital = hospitalRepository.findById(id).orElseThrow(HospitalServiceBusinessException::new);
        List<Contact> contacts = contactRepository.findContactsByHospitalId(hospital.getId()).orElseThrow(HospitalServiceBusinessException::new);
        HospitalDTO hospitalDTO = new HospitalDTO();
        hospitalDTO.setHospital(hospital);
        hospitalDTO.setContacts(contacts);
        return hospitalDTO;
    }
}
