package org.java.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface InfoMapper {
    @Select("select * from info")
    List<Map<String,Object>> infos();
}
