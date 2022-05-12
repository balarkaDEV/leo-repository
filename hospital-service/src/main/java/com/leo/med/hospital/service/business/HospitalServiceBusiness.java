package com.leo.med.hospital.service.business;

import com.leo.med.hospital.service.model.Hospital;
import com.leo.med.hospital.service.model.HospitalDTO;

import java.util.List;

public interface HospitalServiceBusiness {
    public List<Hospital> findAllHospitals();
    public HospitalDTO save(HospitalDTO hospitalDTO);
    public HospitalDTO findById(long id);
}
