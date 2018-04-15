package cn.synu.crm.dao.impl;

import org.springframework.stereotype.Repository;
import cn.synu.crm.dao.ISysUserDao;
import cn.synu.crm.domain.SysUser;

@Repository(ISysUserDao.SERVICE_NAME)
public class SysUserDaoImpl extends CommonDaoImpl<SysUser> implements ISysUserDao {
}
