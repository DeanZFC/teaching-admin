package com.zfc.ta.service;

import com.zfc.ta.entity.CourseTypeDB;
import com.zfc.ta.entity.MajorDB;
import com.zfc.ta.entity.coursel;

import java.util.List;

public interface courselService {
    List<coursel> selCourse(coursel coursel);
    List<MajorDB> selJson();
    List<CourseTypeDB> selCoutu();
    int update(coursel coursel);
    int addcou(coursel coursel);
    int delcou(Integer cid);
    int hfcou(Integer cid);
    int delercou(Integer cid);
}
