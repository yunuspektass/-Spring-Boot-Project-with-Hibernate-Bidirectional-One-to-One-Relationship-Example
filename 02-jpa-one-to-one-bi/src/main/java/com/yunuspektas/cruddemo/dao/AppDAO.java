package com.yunuspektas.cruddemo.dao;

import com.yunuspektas.cruddemo.entity.Instructor;
import com.yunuspektas.cruddemo.entity.InstructorDetail;

public interface AppDAO {
    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);

}




