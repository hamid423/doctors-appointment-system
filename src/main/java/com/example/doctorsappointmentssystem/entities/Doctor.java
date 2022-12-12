package com.example.doctorsappointmentssystem.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor extends User{
    private String speciality;
    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;

}
