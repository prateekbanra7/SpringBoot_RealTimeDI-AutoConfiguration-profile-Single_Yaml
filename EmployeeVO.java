package in.abc.vo;

public class EmployeeVO {

	private String srNo;
	private String empNo;
	private String empName;
	private String sal;
	private String deptNo;
	private String mgrNo;
	
	@Override
	public String toString() {
		return "EmployeeVO [srNo=" + srNo + ", empNO=" + empNo + ", empName=" + empName + ", sal=" + sal + ", deptNo="
				+ deptNo + ", mgrNo=" + mgrNo + "]";
	}

	public String getSrNo() {
		return srNo;
	}

	public void setSrNo(String srNo) {
		this.srNo = srNo;
	}

	public String getEmpNO() {
		return empNo;
	}

	public void setEmpNO(String empNO) {
		this.empNo = empNO;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getMgrNo() {
		return mgrNo;
	}

	public void setMgrNo(String mgrNo) {
		this.mgrNo = mgrNo;
	}
	
	
	
}
