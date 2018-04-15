package cn.synu.crm.service;

import java.util.List;

import cn.synu.bean.ReportBean;

public interface IReportService {
	public final static String  SERVICE_NAME="cn.synu.crm.service.impl.ReportServiceImpl";

	List<ReportBean> findReportBeans();
}
