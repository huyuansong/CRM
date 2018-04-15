package cn.synu.crm.dao.impl;

import org.springframework.stereotype.Repository;
import cn.synu.crm.dao.ISysMenuDao;
import cn.synu.crm.domain.SysMenu;

@Repository(ISysMenuDao.SERVICE_NAME)
public class SysMenuDaoImpl extends CommonDaoImpl<SysMenu> implements ISysMenuDao {
	
}
