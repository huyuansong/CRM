package cn.synu.crm.dao.impl;

import org.springframework.stereotype.Repository;
import cn.synu.crm.dao.ICityDao;
import cn.synu.crm.domain.City;

@Repository(ICityDao.SERVICE_NAME)
public class CityDaoImpl extends CommonDaoImpl<City> implements ICityDao {
	
}
