package cn.synu.crm.service;

import java.util.List;

import cn.synu.bean.SysRoleSearch;
import cn.synu.crm.domain.SysRole;

public interface ISysRoleService {
	public final static String  SERVICE_NAME="cn.synu.crm.service.impl.SysRoleServiceImpl";

	void saveSysRole(SysRole sysRole);

	/**
	 * 通过条件查询权限组的信息
	 * @param sysRoleSearch 封装的是查询条件
	 * @return
	 */
	List<SysRole> findSysRoles(SysRoleSearch sysRoleSearch);

	/**
	 * 通过id查询
	 * @param id
	 * @return
	 */
	SysRole findSysRoleById(String id);

	/**
	 * 修改权限组信息
	 * @param sysRole
	 */
	void updateSysRole(SysRole sysRole);

	/**
	 * 批量删除权限组id
	 * @param ids
	 */
	void deleteSysRolesByIds(String ... ids);

	List<SysRole> findAllSysRoles();
}
