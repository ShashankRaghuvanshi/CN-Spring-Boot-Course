package com.CodingNinjas.LeaveXpress.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import java.util.Date;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class LeaveModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String type;

    @Column(nullable = false)
    public String startDate;

    @Column(nullable = false)
    public String endDate;

    @Column
    public String description;

    @Column
    private boolean isAccepted;


}
