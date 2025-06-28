package in.abc.service;

import java.util.List;

import in.abc.dto.EmployeeDTO;

public interface IEmployeeService {
	public List<EmployeeDTO>  fetchEmpsByDesgs(String desgs[])throws Exception;
}
