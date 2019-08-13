package cn.zanezz.dao;

import cn.zanezz.entity.Token;

public interface TokenMapper {
    int insert(Token record);

    int insertSelective(Token record);
}