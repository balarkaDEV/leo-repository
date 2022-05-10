package com.leo.med.hospital.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hospital")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="owner")
    private String owner;

    @Column(name="owner_type")
    private String ownerType;

    @Column(name="type")
    private String type;

    @Column(name="status")
    private String status;

    @Column(name="employee_strength")
    private String employeeStrength;

    @Column(name="location_type")
    private String locationType;

    @Column(name="emergency")
    private String emergency;

    @Column(name="medicine_shop")
    private String medicineShop;

    @Column(name="created_on")
    private Date createdOn;

    @Column(name="created_by")
    private String createdBy;

    @Column(name="last_modified_on")
    private Date lastModifiedOn;

    @Column(name="last_modified_by")
    private String lastModifiedBy;

}
