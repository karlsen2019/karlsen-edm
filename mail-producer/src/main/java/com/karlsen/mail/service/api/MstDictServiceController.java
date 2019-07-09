package com.karlsen.mail.service.api;

import com.karlsen.mail.entity.MstDict;
import com.karlsen.mail.service.MstDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sauyer
 * @date 2019/7/9 11:33
 */
@RestController
@RequestMapping("/dict/")
public class MstDictServiceController {
    @Autowired
    private MstDictService mstDictService;

    @RequestMapping("mstDictList")
    public List<MstDict> mstDictList() {
        return mstDictService.mstDictList();
    }
}
