package junit;

import org.junit.Test;

import cn.synu.crm.container.ServiceProvinder;
import cn.synu.crm.dao.IReportDao;

public class Testreport {
	  @Test
	  public void testreport(){
		  IReportDao reportDao=(IReportDao)ServiceProvinder.getService(IReportDao.SERVICE_NAME);
		  reportDao.findReportBeans();
		  
	  }
	  
}
