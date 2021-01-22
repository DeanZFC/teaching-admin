package com.zfc.ta.service.impl;

import com.zfc.ta.entity.ScheduleDB;
import com.zfc.ta.mapper.ScheduleMapper;
import com.zfc.ta.service.ScheduleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class ScheduleServiceImpl implements ScheduleService {
    @Resource
    private ScheduleMapper scheduleMapper;

    @Override
    public List<ScheduleDB> findAllSchedule(ScheduleDB scheduleDB) {
        return scheduleMapper.findAllSchedule(scheduleDB);
    }
}