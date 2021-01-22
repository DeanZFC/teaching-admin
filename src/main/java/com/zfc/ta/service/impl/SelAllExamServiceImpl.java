package com.zfc.ta.service.impl;

import com.zfc.ta.entity.SelAllExamVO;
import com.zfc.ta.mapper.SelAllExamMapper;
import com.zfc.ta.service.SelAllExamService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class SelAllExamServiceImpl implements SelAllExamService {
    @Resource
    private SelAllExamMapper selAllExamMapper;
    @Override
    public List<Map> selAllExam(SelAllExamVO selAllExamVO) {
        return selAllExamMapper.selAllExam(selAllExamVO);
    }
}
