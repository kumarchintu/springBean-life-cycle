package org.inetsolv.SpringCoreLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Employee implements InitializingBean,DisposableBean {
	private Integer eno;
	private String ename;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public void checkEmployee() throws Exception
	{
		if(eno==null)
			throw new Exception();
	}
	
	public void afterPropertiesSet() throws Exception {
		if(eno==null)
			throw new Exception();
	}
	
	public void destroy() throws Exception {
		eno=null;
		ename=null;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + "]";
	}
}