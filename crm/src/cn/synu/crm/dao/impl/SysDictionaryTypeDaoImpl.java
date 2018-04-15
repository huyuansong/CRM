package cn.synu.crm.dao.impl;

import org.springframework.stereotype.Repository;

import cn.synu.crm.dao.ISysDictionaryTypeDao;
import cn.synu.crm.domain.SysDictionaryType;

@Repository(ISysDictionaryTypeDao.SERVICE_NAME)
public class SysDictionaryTypeDaoImpl extends CommonDaoImpl<SysDictionaryType> implements ISysDictionaryTypeDao {

}
