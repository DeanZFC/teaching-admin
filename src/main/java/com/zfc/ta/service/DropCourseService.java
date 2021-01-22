package com.zfc.ta.service;

import com.zfc.ta.entity.coursel;

import java.util.List;

public interface DropCourseService {
    List<coursel> seledCourse(String cname, Integer sid);
    int dropcou(Integer sid, Integer cid);
    int updatecou(Integer cid);
}
