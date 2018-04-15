package cn.synu.crm.dao.impl;

import org.springframework.stereotype.Repository;
import cn.synu.crm.dao.ISysRoleDao;
import cn.synu.crm.domain.SysRole;

@Repository(ISysRoleDao.SERVICE_NAME)
public class SysRoleDaoImpl extends CommonDaoImpl<SysRole> implements ISysRoleDao {

}
