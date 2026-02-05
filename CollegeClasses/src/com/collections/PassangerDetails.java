package com.collections;

public class PassangerDetails implements Comparable<Object> {

	private int passangerId;
	private String passangerName;
	private String fromLoc;
	private String toLoc;
	private String passangerMedium;
	
	public PassangerDetails(int passangerId, String passangerName, String fromLoc, String toLoc,
			String passangerMedium) {
		this.passangerId = passangerId;
		this.passangerName = passangerName;
		this.fromLoc = fromLoc;
		this.toLoc = toLoc;
		this.passangerMedium = passangerMedium;
	}

	public int getPassangerId() {
		return passangerId;
	}

	public String getPassangerName() {
		return passangerName;
	}

	public String getFromLoc() {
		return fromLoc;
	}

	public String getToLoc() {
		return toLoc;
	}

	public String getPassangerMedium() {
		return passangerMedium;
	}

	public void setPassangerId(int passangerId) {
		this.passangerId = passangerId;
	}

	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}

	public void setFromLoc(String fromLoc) {
		this.fromLoc = fromLoc;
	}

	public void setToLoc(String toLoc) {
		this.toLoc = toLoc;
	}

	public void setPassangerMedium(String passangerMedium) {
		this.passangerMedium = passangerMedium;
	}

	@Override
	public String toString() {
		return "PassangerDetails [passangerId=" + passangerId + ", passangerName=" + passangerName + ", fromLoc="
				+ fromLoc + ", toLoc=" + toLoc + ", passangerMedium=" + passangerMedium + "]";
	}


	@Override
	public int compareTo(Object o) {
		
		return 0;
	}
	
	
	
}
