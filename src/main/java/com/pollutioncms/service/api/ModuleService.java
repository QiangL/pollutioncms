package com.pollutioncms.service.api;

import com.pollutioncms.service.dto.ModuleDTO;

import java.util.List;

/**
 * @author liqiag
 * @discription ModuleService
 * @date 2018-04-28
 **/
public interface ModuleService {

    /**
     * 获取最底层权限之外的模块结构
     * @return
     */
    List<ModuleDTO> listModule();

    List<ModuleDTO> listAllAuths();

    /**
     * 根据parentId获取权限
     * @param parentId
     * @return
     */
    List<ModuleDTO> listAuths(Integer parentId);

    /**
     * 获取模块结构和权限
     * @param roleName
     * @return
     */
    List<ModuleDTO> listModuleAuths(String roleName);

    int getModuleOpsCount(Integer parentId);

    boolean saveModule(ModuleDTO moduleDTO);

    boolean updateModule(ModuleDTO moduleDTO);

    boolean deleteModule(ModuleDTO moduleDTO);

    boolean updateRoleAuths(String roleName, List<Integer> ids);

    List<Integer> checkAuthIds(List<Integer> ids);
}
