package cn.synu.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.synu.bean.ReportBean;
import cn.synu.crm.dao.IReportDao;
import cn.synu.crm.service.IReportService;

@Transactional(readOnly=true)
@Service(IReportService.SERVICE_NAME)
public class ReportServiceImpl implements IReportService {

	@Resource(name=IReportDao.SERVICE_NAME)
	private IReportDao reportDao;
	
	public List<ReportBean> findReportBeans() {
		List<ReportBean> list=reportDao.findReportBeans();
		return list;
	}
	
}
