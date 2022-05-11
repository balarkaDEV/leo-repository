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
@Table(name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="address_line1")
    private String addressLine1;

    @Column(name="address_line2")
    private String addressLine2;

    @Column(name="city")
    private String city;

    @Column(name="state")
    private String state;

    @Column(name="pin_code")
    private String pinCode;

    @Column(name="country")
    private String country;

    @Column(name="phone_no1")
    private String phoneNo1;

    @Column(name="phone_no2")
    private String phoneNo2;

    @Column(name="mobile_no")
    private String mobileNo;

    @Column(name="email")
    private String email;

    @Column(name="fax")
    private String fax;

    @Column(name="hospital_id")
    private long hospitalId;

    @Column(name="created_on")
    private Date createdOn;

    @Column(name="created_by")
    private String createdBy;

    @Column(name="last_modified_on")
    private Date lastModifiedOn;

    @Column(name="last_modified_by")
    private String lastModifiedBy;

}
