package com.bhcy.util;
/**
 * 前端返回响应信息
 * @author huoy
 * @ClassName :ResponseMessage
 * @version 版本
 * @ModifiedBy 修改人
 * @date 2018年3月27日
 */
public class ResponseMessage {
	//返回状态信息{"ok","error","warning"}
	private String status;
	//返回文本信息
	private String context;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	@Override
	public String toString() {
		return "ResponseMessage [status=" + status + ", context=" + context
				+ "]";
	}
	
}
