package cn.synu.crm.dao;

import cn.synu.crm.domain.Company;

public interface ICompanyDao extends ICommonDao<Company> {
	public final static String  SERVICE_NAME="cn.synu.crm.dao.impl.CompanyDaoImpl";
}
