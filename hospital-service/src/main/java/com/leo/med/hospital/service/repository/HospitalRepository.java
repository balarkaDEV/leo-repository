package com.leo.med.hospital.service.repository;

import com.leo.med.hospital.service.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
}
