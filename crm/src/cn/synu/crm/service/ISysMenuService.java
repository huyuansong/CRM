package cn.synu.crm.service;

import java.util.List;

import cn.synu.crm.domain.SysMenu;

public interface ISysMenuService {
	public final static String  SERVICE_NAME="cn.synu.crm.service.impl.SysMenuServiceImpl";
	List<SysMenu> findAllSysMenus();
	List<SysMenu> findAllSysMenusCache();
}
