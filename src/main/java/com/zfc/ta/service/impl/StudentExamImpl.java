package com.zfc.ta.service.impl;

import com.zfc.ta.entity.*;
import com.zfc.ta.mapper.StuExamMapper;
import com.zfc.ta.service.StudentExamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentExamImpl implements StudentExamService {
@Resource
private StuExamMapper stuExamMapper;

    @Override
    public List<DepartmentDB> selDes() {
        return stuExamMapper.selDes();
    }

    @Override
    public List<MajorDB> selMas(Integer did) {
        return stuExamMapper.selMas(did);
    }

    @Override
    public List<GradeDB> selGrs(Integer mid) {
        return stuExamMapper.selGrs(mid);
    }

    @Override
    public List<ClassinfoDB> selClasss(Integer gid) {
        return stuExamMapper.selClasss(gid);
    }

    @Override
    public List<StuExamVO> selScs(StuExamVO stuExamVO) {
        return stuExamMapper.selScs(stuExamVO);
    }

    @Override
    public int add(StuExamVO stuExamVO) {
        return stuExamMapper.add(stuExamVO);
    }

    @Override
    public int selExam(StuExamVO stuExamVO) {
        return stuExamMapper.selExam(stuExamVO);
    }


    @Override
    public int updateExam(StuExamDB stuExamDB) {
        return stuExamMapper.updateExam(stuExamDB);
    }
}
