package com.cmb.okr.frame.db;

import java.util.List;

/**
 * 分页查询结果
 * 
 * @author hf
 *
 * @param <T>
 */
public class PagingResult<T> {

	/**
	 * 总页数
	 */
	private int totalPage;

	/**
	 * 总数
	 */
	private int totalNum;

	/**
	 * 查询结果
	 */
	private List<T> result;

	public int getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(int pageSize) {
		this.totalPage = totalNum % pageSize == 0 ? totalNum / pageSize : totalNum / pageSize + 1;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}

	public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}

}
