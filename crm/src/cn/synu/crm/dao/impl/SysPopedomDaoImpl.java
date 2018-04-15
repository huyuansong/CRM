package cn.synu.crm.dao.impl;

import org.springframework.stereotype.Repository;
import cn.synu.crm.dao.ISysPopedomDao;
import cn.synu.crm.domain.SysPopedom;

@Repository(ISysPopedomDao.SERVICE_NAME)
public class SysPopedomDaoImpl extends CommonDaoImpl<SysPopedom> implements ISysPopedomDao {

}
