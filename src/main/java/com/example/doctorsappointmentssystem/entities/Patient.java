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
public class Patient extends User{

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;
}
