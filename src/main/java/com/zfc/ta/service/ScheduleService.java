package com.zfc.ta.service;

import com.zfc.ta.entity.ScheduleDB;

import java.util.List;

public interface ScheduleService {
    List<ScheduleDB> findAllSchedule(ScheduleDB scheduleDB);
    /*int deleteNews(Integer nId);
    int addNews(NewsDB news);
    int editNews(NewsDB news);*/
}