package com.cmb.okr.frame.base;

/**
 * json格式相应
 * @author hf
 *
 */
public class JsonResponse {

	public JsonResponse() {
		this.code = "200";
	}

	/**
	 * 响应码
	 */
	private String code;

	/**
	 * 错误消息
	 */
	private String msg;

	/**
	 * 返回结果
	 */
	private Object result;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}
}
