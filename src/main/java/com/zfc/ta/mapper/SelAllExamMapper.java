package com.zfc.ta.mapper;

import com.zfc.ta.entity.SelAllExamVO;

import java.util.List;
import java.util.Map;

public interface SelAllExamMapper {
    List<Map> selAllExam(SelAllExamVO selAllExamVO);
}
