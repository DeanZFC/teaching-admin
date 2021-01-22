package com.zfc.ta.mapper;

import com.zfc.ta.entity.NewsinfoDB;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NewsMapper {
    List<NewsinfoDB> findAllNews(NewsinfoDB newsinfoDB);
    int deleteNews(Integer nId);
    int addNews(NewsinfoDB newsinfoDB);
    int editNews(NewsinfoDB newsinfoDB);
}
