

package com.neta.api.core.composite;

public class ServiceAddresses {

	private final String cmp;
	private final String pro;
	private final String rev;

	public ServiceAddresses() {
		cmp = null;
		pro = null;
		rev = null;

	}

	public ServiceAddresses(String compositeAddress, String productAddress, String reviewAddress) {
		this.cmp = compositeAddress;
		this.pro = productAddress;
		this.rev = reviewAddress;

	}

	public String getCmp() {
		return cmp;
	}

	public String getPro() {
		return pro;
	}

	public String getRev() {
		return rev;
	}

}
