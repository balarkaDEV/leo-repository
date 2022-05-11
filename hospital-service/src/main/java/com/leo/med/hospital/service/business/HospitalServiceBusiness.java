package com.leo.med.hospital.service.business;

import com.leo.med.hospital.service.exception.HospitalServiceBusinessException;
import com.leo.med.hospital.service.model.Contact;
import com.leo.med.hospital.service.model.Hospital;
import com.leo.med.hospital.service.repository.ContactRepository;
import com.leo.med.hospital.service.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalServiceBusiness {

    @Autowired
    private HospitalRepository hospitalRepository;
    @Autowired
    private ContactRepository contactRepository;

    public List<Hospital> findAllHospitals(){
        return Optional.of(hospitalRepository.findAll()).orElseThrow(HospitalServiceBusinessException::new);
    }

    public List<Contact> findAllContacts(){
        return Optional.of(contactRepository.findAll()).orElseThrow(HospitalServiceBusinessException::new);
    }

    public Hospital save(Hospital hospital, List<Contact> contacts){
        Hospital savedHospital = hospitalRepository.save(hospital);

        for(Contact contact : contacts){
            contact.setHospitalId(savedHospital.getId());
            contactRepository.save(contact);
        }

        return savedHospital;
    }

    public Optional<Hospital> findHospitalById(long id){
        return hospitalRepository.findById(id);
    }

    public Optional<Contact> findContactById(long id){
        return contactRepository.findById(id);
    }
}
