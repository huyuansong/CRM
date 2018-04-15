package cn.synu.crm.web.action;

import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import cn.synu.crm.container.ServiceProvinder;
import cn.synu.crm.domain.SysMenu;
import cn.synu.crm.service.ISysMenuPrivilegeService;
import cn.synu.crm.service.ISysMenuService;

@SuppressWarnings("serial")
public class MenuAction extends BaseAction {

	//获取菜单功能的业务层
	private ISysMenuService sysMenuService=
		    (ISysMenuService)ServiceProvinder.getService(ISysMenuService.SERVICE_NAME);

	//获取菜单权限的业务层
	private ISysMenuPrivilegeService sysMenuPrivilegeService=
		    (ISysMenuPrivilegeService)ServiceProvinder.getService(ISysMenuPrivilegeService.SERVICE_NAME);
	
	
	public  String top(){
		// <result name="top">/WEB-INF/page/menu/top.jsp</result>
		return "top";
	}
	
	public  String left(){
        //查询所有的菜单功能, sys_menu
		List<SysMenu> sysMenus=sysMenuService.findAllSysMenusCache();
		ServletContext sc=ServletActionContext.getServletContext();
		sc.setAttribute("sysMenus", sysMenus);
		
		//<result name="left">/WEB-INF/page/menu/left.jsp</result>      
		return "left";
	}
}
