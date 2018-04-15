package cn.synu.crm.service;

import java.util.List;

import cn.synu.crm.domain.City;

public interface ICityService {
	public final static String  SERVICE_NAME="cn.synu.crm.service.impl.CityServiceImpl";

	/**
	 * 通过省的id获取该省得城市信息s
	 * @param id
	 * @return
	 */
	List<City> findCitiesByPid(Integer id);
}
