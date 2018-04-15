package cn.synu.crm.container;

import org.apache.commons.lang.StringUtils;
//该类为一个容器，实现对函数的封装，好处是能够避免在使用的时候不断的new对象再获取方法，
//采用此种方式可以直接的访问到 常用的方法，效率更高
public class ServiceProvinder {
	private static ServiceProvinderCore sc;
	
	static{
		sc=new ServiceProvinderCore();
		sc.load("beans.xml");
	}
	
	public static Object getService(String beanName){
		if(StringUtils.isBlank(beanName)){
			throw new RuntimeException("您要访问的服务名称不能为空");
		}
		Object bean=null;
		//如果spring容器中包含beanName
		if(sc.ctx.containsBean(beanName)){
			bean=sc.ctx.getBean(beanName);
		}
		
		//如果spring容器中不包含beanName
		if(bean==null){
			throw new RuntimeException("您要访问的服务名称["+beanName+"]不存在");
		}
		
		return bean;
	}

}
