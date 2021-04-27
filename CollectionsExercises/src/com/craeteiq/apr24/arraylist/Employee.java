package com.craeteiq.apr24.arraylist;

import java.util.Comparator;

public class Employee implements Comparable <Employee>{
	private Integer eId;
	private String eName;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eId == null) ? 0 : eId.hashCode());
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (eId == null) {
			if (other.eId != null)
				return false;
		} else if (!eId.equals(other.eId))
			return false;
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		return true;
	}


	public Employee() {
		
	}


	public Employee(Integer eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}


	public Integer geteId() {
		return eId;
	}


	public void seteId(Integer eId) {
		this.eId = eId;
	}


	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + "]";
	}


	


	


	
	


	@Override
	public int compareTo(Employee o) {
		
		return this.geteName().compareTo(o.geteName());
	}


	



	
	
	}
