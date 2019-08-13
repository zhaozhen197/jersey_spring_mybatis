package cn.zanezz.dao;

import cn.zanezz.entity.Event;

public interface EventMapper {
    int deleteByPrimaryKey(Integer eventId);

    int insert(Event record);

    int insertSelective(Event record);

    Event selectByPrimaryKey(Integer eventId);

    int updateByPrimaryKeySelective(Event record);

    int updateByPrimaryKey(Event record);
}