package com.karlsen.mail.service;

import com.karlsen.mail.config.database.ReadOnlyConnection;
import com.karlsen.mail.entity.MstDict;
import com.karlsen.mail.mapper.MstDictMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sauyer
 * @date 2019/7/9 11:29
 */
@Service
public class MstDictService {
    @Autowired
    private MstDictMapper mstDictMapper;

    @ReadOnlyConnection
    public List<MstDict> mstDictList() {
        return mstDictMapper.selectAll();
    }
}
