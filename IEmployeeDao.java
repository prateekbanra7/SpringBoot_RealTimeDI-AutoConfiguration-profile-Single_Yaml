package in.abc.dao;

import java.util.List;

import in.abc.bo.EmployeeBO;

public interface IEmployeeDao {
	public  List<EmployeeBO>  getEmpsByDesg(String cond)throws Exception;
}
