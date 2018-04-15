package cn.synu.crm.service;

import java.util.List;

import cn.synu.crm.domain.SysPopedom;

public interface ISysPopedomService {
	public final static String  SERVICE_NAME="cn.synu.crm.service.impl.SysPopedomServiceImpl";

	/**
	 * 获取操作功能表的所有数据
	 * @return
	 */
	List<SysPopedom> findAllSysPopedoms();
}
