package com.zfc.ta.service.impl;

import com.zfc.ta.entity.CourseTypeDB;
import com.zfc.ta.entity.SelectCourseVo;
import com.zfc.ta.entity.StuCourseDB;
import com.zfc.ta.entity.StudentDB;
import com.zfc.ta.mapper.SelectCourseMapper;
import com.zfc.ta.service.SelectCourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SelectCourseImpl implements SelectCourseService {
@Resource
private SelectCourseMapper selectCourseMapper;

    //查询开设课程
    @Override
    public List<SelectCourseVo> sel(SelectCourseVo selectCourseVo) {
        return selectCourseMapper.sel(selectCourseVo);
    }
//查询课程类型
    @Override
    public List<CourseTypeDB> selType() {
        return selectCourseMapper.selType();
    }
    //查询学生id
    @Override
    public StudentDB selStudentid(String stuid) {
        return selectCourseMapper.selStudentid(stuid);
    }

    //查询是否有该课程
    @Override
    public int selCourse(StuCourseDB stuCourseDB) {
        return selectCourseMapper.selCourse(stuCourseDB);
    }
//添加课程
    @Override
    public int addCourse(StuCourseDB stuCourseDB) {
        return selectCourseMapper.addCourse(stuCourseDB);
    }
//修改可选人数
    @Override
    public int updateCount(StuCourseDB stuCourseDB) {
        return selectCourseMapper.updateCount(stuCourseDB);
    }



}
