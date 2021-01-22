package com.zfc.ta.service.impl;

import com.zfc.ta.entity.TchSelStuExamVO;
import com.zfc.ta.mapper.TchSelStuExamMapper;
import com.zfc.ta.service.TchSelStuExamService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class TchSelStuExamServiceImpl implements TchSelStuExamService {

    @Resource
    private TchSelStuExamMapper tchSelStuExamMapper;

    @Override
    public List<Map> selTchClass(String tid) {
        return tchSelStuExamMapper.selTchClass(tid);
    }

    @Override
    public List<Map> tchSelStuExam(TchSelStuExamVO tchSelStuExamVO) {
        return tchSelStuExamMapper.tchSelStuExam(tchSelStuExamVO);
    }

    @Override
    public List<Map> selTchGrade(String tid) {
        return tchSelStuExamMapper.selTchGrade(tid);
    }

}
