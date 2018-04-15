package cn.synu.crm.dao;

import java.util.List;

import cn.synu.bean.ReportBean;

public interface IReportDao extends ICommonDao<ReportBean> {
	public final static String  SERVICE_NAME="cn.synu.crm.dao.impl.ReportDaoImpl";

	/**
	 * 查询报表的数据
	 * @return
	 */
	List<ReportBean> findReportBeans(); 
}
