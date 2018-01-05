package com.cmb.okr.frame.db;

import org.apache.ibatis.session.SqlSession;

@FunctionalInterface
public interface BatchOperator {

	public void doBatch(SqlSession batchSqlSession);
}
