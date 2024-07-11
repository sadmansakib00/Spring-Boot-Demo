package com.example.project.data.entity;

import com.example.project.common.enums.Rank;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "instructor")
public class Instructor {

    @Id
    @Column(name = "id", columnDefinition = "long")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "instructor_name")
    private String instructorName;

    @Column(name = "instructor_office")
    private String instructorOffice;

    @Column(name = "rank")
    @Enumerated(EnumType.STRING)
    private Rank rank;

}
