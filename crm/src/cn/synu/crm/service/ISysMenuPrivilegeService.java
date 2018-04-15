package cn.synu.crm.service;

import java.util.List;

import cn.synu.crm.domain.SysMenuPrivilege;

public interface ISysMenuPrivilegeService {
	public final static String  SERVICE_NAME="cn.synu.crm.service.impl.SysMenuPrivilegeServiceImpl";

	void updateMenu(String roleId, String[] menuModules);

	List<SysMenuPrivilege> findsysMenuPrivilegesByRoleId(String roleId);

	List<SysMenuPrivilege> findAllSysMenuPrivileges();

	List<SysMenuPrivilege> findAllSysMenuPrivilegesCache();
}
