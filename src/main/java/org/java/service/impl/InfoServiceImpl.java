package org.java.service.impl;

import org.java.dao.InfoMapper;
import org.java.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    InfoMapper infoMapper;

    @Override
    public List<Map<String, Object>> getList() {
        return infoMapper.infos();
    }
}
