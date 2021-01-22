package com.zfc.ta.service;

import com.zfc.ta.entity.*;

import java.util.List;

public interface StudentExamService {
    List<DepartmentDB> selDes();
    List<MajorDB> selMas(Integer did);
    List<GradeDB> selGrs(Integer mid);
    List<ClassinfoDB> selClasss(Integer gid);
    List<StuExamVO> selScs(StuExamVO stuExamVO);
    int add(StuExamVO stuExamVO);
    int selExam(StuExamVO stuExamVO);
    int updateExam(StuExamDB stuExamDB);
}
