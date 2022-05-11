package com.leo.med.hospital.service.repository;

import com.leo.med.hospital.service.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
