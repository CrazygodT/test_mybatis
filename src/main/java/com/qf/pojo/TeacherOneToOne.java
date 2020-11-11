package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class TeacherOneToOne {

    private Integer tid;

    private String teacherName;

    private int age;

    private String address;

    private Classes classes;
}
