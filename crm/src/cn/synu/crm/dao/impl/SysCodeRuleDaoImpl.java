package cn.synu.crm.dao.impl;

import org.springframework.stereotype.Repository;

import cn.synu.crm.dao.ISysCodeRuleDao;
import cn.synu.crm.domain.SysCodeRule;

@Repository(ISysCodeRuleDao.SERVICE_NAME)
public class SysCodeRuleDaoImpl extends  CommonDaoImpl<SysCodeRule> implements ISysCodeRuleDao {

}
