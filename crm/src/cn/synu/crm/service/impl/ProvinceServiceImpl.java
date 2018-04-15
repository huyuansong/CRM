package cn.synu.crm.service.impl;

import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.synu.crm.dao.IProvinceDao;
import cn.synu.crm.domain.Province;
import cn.synu.crm.service.IProvinceService;

@Transactional(readOnly=true)
@Service(IProvinceService.SERVICE_NAME)
public class ProvinceServiceImpl  implements IProvinceService{

	@Resource(name=IProvinceDao.SERVICE_NAME)
	private IProvinceDao provinceDao;
	
	public List<Province> findAllProvinces() {
		LinkedHashMap<String, String> orderby=new LinkedHashMap<String, String>();
		orderby.put("o.id", "asc");
		return provinceDao.findObjectsByConditionWithNoPage(orderby);
	}

	public Province findProvinceByName(String name) {
		if(StringUtils.isNotBlank(name)){
			String whereHql=" and o.name = ? ";
			Object[] params={name};
			
			List<Province> list=provinceDao.findObjectsByConditionWithNoPage(whereHql, params);
			if(list!=null&&list.size()==1){
				return list.get(0);
			}
		}
		return null;
	}

}
