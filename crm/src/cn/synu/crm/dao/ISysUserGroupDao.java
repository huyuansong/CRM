package cn.synu.crm.dao;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

import cn.synu.crm.domain.SysUserGroup;

public interface ISysUserGroupDao extends ICommonDao<SysUserGroup> {
	public final static String  SERVICE_NAME="cn.synu.crm.dao.impl.SysUserGroupDaoImpl";

}
