package cn.synu.crm.dao.impl;

import org.springframework.stereotype.Repository;

import cn.synu.crm.dao.ISysUserGroupDao;
import cn.synu.crm.domain.SysUserGroup;

@Repository(ISysUserGroupDao.SERVICE_NAME)
public class SysUserGroupDaoImpl extends CommonDaoImpl<SysUserGroup> implements ISysUserGroupDao {

}
