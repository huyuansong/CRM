package junit;

import org.junit.Test;

import cn.synu.crm.container.ServiceProvinder;
import cn.synu.crm.dao.ISysUserDao;
import cn.synu.crm.domain.SysRole;
import cn.synu.crm.domain.SysUser;
import cn.synu.crm.domain.SysUserGroup;
import cn.synu.crm.util.MD5keyBean;

public class TestSysUser {

	@Test
	public void saveSysUser(){
		ISysUserDao sysUserDao=(ISysUserDao)ServiceProvinder.getService(ISysUserDao.SERVICE_NAME);
		
		SysUser sysUser=new SysUser();
		sysUser.setName("admin");
		sysUser.setCnname("系统管理员");
		
		SysUserGroup  sysUserGroup=new SysUserGroup();
		sysUserGroup.setId(21);
		sysUser.setSysUserGroup(sysUserGroup);
		
	    SysRole sysRole=new SysRole();
	    sysRole.setId("402881e4324d516701324d5370740002");
	    sysUser.setSysRole(sysRole);
		
		//密码
		MD5keyBean m = new MD5keyBean();
		String md5 = m.getkeyBeanofStr("admin");
		System.out.println(md5);
		sysUser.setPassword(md5);
		
		sysUserDao.save(sysUser);
		
	}
}
