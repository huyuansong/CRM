package cn.synu.crm.service;

import java.util.List;

import cn.synu.crm.domain.Province;

public interface IProvinceService {
	public final static String  SERVICE_NAME="cn.synu.crm.service.impl.ProvinceServiceImpl";

	//获取所有的省的信息
	List<Province> findAllProvinces();

	/**
	 * 通过省的名称获取省的对象
	 * @param name
	 * @return
	 */
	Province findProvinceByName(String name);
}
