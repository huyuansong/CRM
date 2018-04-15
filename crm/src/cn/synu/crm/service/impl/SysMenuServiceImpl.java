package cn.synu.crm.service.impl;

import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.synu.crm.dao.ISysMenuDao;
import cn.synu.crm.domain.SysMenu;
import cn.synu.crm.service.ISysMenuService;

@Transactional(readOnly=true)
@Service(ISysMenuService.SERVICE_NAME)
public class SysMenuServiceImpl implements ISysMenuService {
	
	@Resource(name=ISysMenuDao.SERVICE_NAME)
	private ISysMenuDao sysMenuDao;
	
	public List<SysMenu> findAllSysMenus() {
		LinkedHashMap<String, String> orderby=new LinkedHashMap<String, String>();
		orderby.put("o.sort", "asc");
		return sysMenuDao.findObjectsByConditionWithNoPage(orderby);
	}


	public List<SysMenu> findAllSysMenusCache() {
		LinkedHashMap<String, String> orderby=new LinkedHashMap<String, String>();
		orderby.put("o.sort", "asc");
		return sysMenuDao.findObjectsByConditionWithNoPageCache(null,null,orderby);
	}
}
