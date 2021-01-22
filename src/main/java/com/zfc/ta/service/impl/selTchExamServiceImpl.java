package com.zfc.ta.service.impl;

import com.zfc.ta.entity.SelTchExamVO;
import com.zfc.ta.mapper.SelTchExamMapper;
import com.zfc.ta.service.SelTchExamService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class selTchExamServiceImpl implements SelTchExamService {
    @Resource
    private SelTchExamMapper selTchExamMapper;

    @Override
    public List<Map> selTchExam(SelTchExamVO selTchExamVO) {
        return selTchExamMapper.selTchExam(selTchExamVO);
    }
}
