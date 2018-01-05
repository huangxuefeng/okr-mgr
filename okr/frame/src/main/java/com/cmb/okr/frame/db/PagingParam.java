package com.cmb.okr.frame.db;

/**
 * 分页查询
 * 
 * @author hf
 *
 * @param <T>
 */
public class PagingParam<T> {

	/**
	 * 每页数量
	 */
	private int pageSize = 10;

	/**
	 * 当前页
	 */
	private int pageNo = 1;

	/**
	 * 查询条件
	 */
	private T param;

	public int getOffset() {
		return (pageNo - 1) * pageSize;
	}

	public int getLimit() {
		return pageSize * pageNo;
	}

	public T getParam() {
		return param;
	}

	public void setParam(T param) {
		this.param = param;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
}
