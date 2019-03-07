package com.sly.demo.importpic.model;

import java.io.Serializable;

/**
 * 
 * @author sly
 * @time 2019年3月7日
 */
public class ByteArray implements Serializable {

	private static final long serialVersionUID = -8085790620906366224L;

	private String id;
	private String deploymentId;
	private byte[] bytes;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDeploymentId() {
		return deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}

	public byte[] getBytes() {
		return bytes;
	}

	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}

}
