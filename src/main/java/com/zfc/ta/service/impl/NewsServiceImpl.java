package com.zfc.ta.service.impl;

import com.zfc.ta.entity.NewsinfoDB;
import com.zfc.ta.mapper.NewsMapper;
import com.zfc.ta.service.NewsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsMapper newsMapper;
    @Override
    public List<NewsinfoDB> findAllNews(NewsinfoDB newsinfoDB) {
        return newsMapper.findAllNews(newsinfoDB);
    }

    @Override
    public int deleteNews(Integer nId) {
        return newsMapper.deleteNews(nId);
    }

    @Override
    public int addNews(NewsinfoDB newsinfoDB) {
        return newsMapper.addNews(newsinfoDB);
    }

    @Override
    public int editNews(NewsinfoDB newsinfoDB) {
        return newsMapper.editNews(newsinfoDB);
    }
}