package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

    private Integer tid;

    private String teacherName;

    private int age;

    private String address;

    private List<Classes> classesList;
}
