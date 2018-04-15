package junit;

import org.junit.Test;

import cn.synu.crm.container.ServiceProvinder;
import cn.synu.crm.dao.ICompanyDao;
import cn.synu.crm.domain.Company;
import cn.synu.crm.domain.SysUser;

public class TestCompany {

	  @Test
	  public void saveCompany(){
		  ICompanyDao companyDao=(ICompanyDao)ServiceProvinder.getService(ICompanyDao.SERVICE_NAME);
		  Company c=new Company();
		  c.setCode("xxxx");
		  c.setName("xxxxx");
		  SysUser sysUser=new SysUser();
		  sysUser.setId(4);
		  c.setSysUser(sysUser);
		  c.setShareFlag('N');
		  
		  companyDao.save(c);
		  
	  }
	  
	  
	  
	
}
