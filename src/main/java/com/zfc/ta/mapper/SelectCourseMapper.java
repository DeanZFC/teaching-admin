package com.zfc.ta.mapper;

import com.zfc.ta.entity.CourseTypeDB;
import com.zfc.ta.entity.SelectCourseVo;
import com.zfc.ta.entity.StuCourseDB;
import com.zfc.ta.entity.StudentDB;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SelectCourseMapper {
    //查询开设课程
    public List<SelectCourseVo> sel(SelectCourseVo selectCourseVo);
    //查询课程类别
    public List<CourseTypeDB> selType();
    //查询学生id
    public StudentDB selStudentid(String stuid);
    //查询是否有该课程
    public  int selCourse(StuCourseDB stuCourseDB);
    //添加课程
    public int addCourse(StuCourseDB stuCourseDB);
    //修改可选人数
    public int updateCount(StuCourseDB stuCourseDB);
}
