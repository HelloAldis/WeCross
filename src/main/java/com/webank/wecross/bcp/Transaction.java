package com.webank.wecross.bcp;

public class Transaction {
	private String to;
	private String method;
	private Object args[];
	
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	
	public Object[] getArgs() {
		return args;
	}
	public void setArgs(Object args[]) {
		this.args = args;
	}
}
