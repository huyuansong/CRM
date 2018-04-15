package cn.synu.crm.dao.impl;

import org.springframework.stereotype.Repository;
import cn.synu.crm.dao.ICompanyDao;
import cn.synu.crm.domain.Company;

@Repository(ICompanyDao.SERVICE_NAME)
public class CompanyDaoImpl extends CommonDaoImpl<Company> implements ICompanyDao {


}
