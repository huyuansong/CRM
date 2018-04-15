package cn.synu.crm.dao.impl;

import org.springframework.stereotype.Repository;

import cn.synu.crm.dao.IProvinceDao;
import cn.synu.crm.domain.Province;

@Repository(IProvinceDao.SERVICE_NAME)
public class ProvinceDaoImpl extends CommonDaoImpl<Province> implements IProvinceDao {
}
