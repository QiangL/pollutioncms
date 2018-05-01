package com.pollutioncms.web.utils;

import com.pollutioncms.service.dto.ModuleDTO;
import com.pollutioncms.web.vo.LigerTreeVO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiag
 * @discription LigerTreeVOUtil
 * @date 2018-04-30
 **/
public class LigerTreeVOUtil {

    public static LigerTreeVO fill(ModuleDTO dto) {
        LigerTreeVO data = new LigerTreeVO();
        data.setId(dto.getId());
        data.setPid(dto.getPid());
        data.setText(dto.getName());
        data.setLeaf(dto.getLeaf());
        data.setUrl(dto.getUrl());
        return data;
    }

    public static List<LigerTreeVO> fill(List<ModuleDTO> dtos) {
        List<LigerTreeVO> datas = new ArrayList<>();
        for (ModuleDTO dto : dtos) {
            datas.add(fill(dto));
        }
        return datas;
    }
}
