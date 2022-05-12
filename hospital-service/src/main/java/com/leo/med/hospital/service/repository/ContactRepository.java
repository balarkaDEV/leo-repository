package com.leo.med.hospital.service.repository;

import com.leo.med.hospital.service.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    @Query(value = "from Contact p where p.hospitalId=:hospitalId")
    Optional<List<Contact>> findContactsByHospitalId(@Param("hospitalId") long hospitalId);
}
