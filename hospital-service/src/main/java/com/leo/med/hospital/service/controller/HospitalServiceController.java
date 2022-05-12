package com.leo.med.hospital.service.controller;

import com.leo.med.hospital.service.business.HospitalServiceBusiness;
import com.leo.med.hospital.service.business.HospitalServiceBusinessImpl;
import com.leo.med.hospital.service.model.HospitalDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="${root.service.moduleurl}")
public class HospitalServiceController {

    @Autowired
    private HospitalServiceBusiness hospitalServiceBusiness;

    @GetMapping(value="/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HospitalDTO> findById(@PathVariable long id){
        return new ResponseEntity<HospitalDTO>(hospitalServiceBusiness.findById(id), HttpStatus.OK);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HospitalDTO> save(@RequestBody final HospitalDTO hospitalDTO){
        return new ResponseEntity<HospitalDTO>(hospitalServiceBusiness.save(hospitalDTO), HttpStatus.OK);
    }
}
