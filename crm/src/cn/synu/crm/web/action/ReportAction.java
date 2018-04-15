package cn.synu.crm.web.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import cn.synu.bean.ReportBean;
import cn.synu.crm.container.ServiceProvinder;
import cn.synu.crm.service.IReportService;
import cn.synu.crm.util.JFreeChartUtils;

@SuppressWarnings("serial")
public class ReportAction extends BaseAction {
	private IReportService reportService=
		  (IReportService)ServiceProvinder.getService(IReportService.SERVICE_NAME);
	
	public String khflfx() throws IOException{
		List<ReportBean> reportBeans=reportService.findReportBeans();
		request.setAttribute("reportBeans", reportBeans);
		
		//计算总数
		Long sum=0L;
		if(reportBeans!=null&&reportBeans.size()>0){
			for(ReportBean reportBean:reportBeans){
				sum=sum+reportBean.getCount();
			}
		}
		request.setAttribute("sum", sum);
		
		//获取servletContext对象
		ServletContext sc=ServletActionContext.getServletContext();
		
		//生成图片
		JFreeChartUtils.generalBarJpeg(reportBeans,request,sc);
		
		return "khflfx";
	}
	
}
