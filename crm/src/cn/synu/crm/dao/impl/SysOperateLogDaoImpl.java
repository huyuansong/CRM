package cn.synu.crm.dao.impl;

import org.springframework.stereotype.Repository;

import cn.synu.crm.dao.ISysOperateLogDao;
import cn.synu.crm.domain.SysOperateLog;

@Repository(ISysOperateLogDao.SERVICE_NAME)
public class SysOperateLogDaoImpl extends CommonDaoImpl<SysOperateLog> implements ISysOperateLogDao {

}
