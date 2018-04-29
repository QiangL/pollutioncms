package com.pollutioncms.service.api;

import com.pollutioncms.service.dto.ModuleDTO;

import java.util.List;

/**
 * @author liqiag
 * @discription ModuleService
 * @date 2018-04-28
 **/
public interface ModuleService {

    List<ModuleDTO> listModule();

    List<ModuleDTO> listModuleOps(Integer parentId);

    int getModuleOpsCount(Integer parentId);

    boolean saveModule(ModuleDTO moduleDTO);

    boolean updateModule(ModuleDTO moduleDTO);

    boolean deleteModule(ModuleDTO moduleDTO);
}
