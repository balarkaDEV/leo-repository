package com.leo.med.hospital.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HospitalDTO {
    private Hospital hospital;
    private List<Contact> contacts;
}
