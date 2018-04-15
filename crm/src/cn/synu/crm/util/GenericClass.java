package cn.synu.crm.util;

import java.lang.reflect.ParameterizedType;

public class GenericClass {

	/**
	 * 获取父类的泛型类型
	 * @param clazz
	 * @return
	 */
	public static Class getGenericClass(Class clazz) {
		ParameterizedType  type=(ParameterizedType)clazz.getGenericSuperclass();
		
		/*
		 * cn.synu.crm.dao.impl.CommonDaoImpl<cn.synu.crm.domain.SysUserGroup>
		 * CommonDaoImpl<SysUserGroup>
		 */
		//System.out.println("type  "+type);
		
		Class entityClass=(Class) type.getActualTypeArguments()[0];
		
		//cn.synu.crm.domain.SysUserGroup
		//System.out.println("entityClass  "+entityClass);
		
		return entityClass;
	}

}
