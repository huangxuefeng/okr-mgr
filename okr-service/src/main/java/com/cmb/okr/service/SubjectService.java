package com.cmb.okr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmb.okr.dao.domain.Subject;
import com.cmb.okr.frame.db.BaseDao;
import com.cmb.okr.frame.db.PagingParam;
import com.cmb.okr.frame.db.PagingResult;
import com.cmb.okr.frame.util.IdUtils;

@Service
public class SubjectService {

	@Autowired
	BaseDao baseDao;

	public Subject insert(Subject subject) {
		subject.setId(IdUtils.getUUID());
		baseDao.insert(subject);
		return subject;
	}

	public void delete(String id) {
		Subject subject = new Subject();
		subject.setId(id);
		baseDao.delete(subject);
	}

	public void update(Subject subject) {
		baseDao.update(subject);
	}

	public Subject load(String id) {
		Subject subject = new Subject();
		subject.setId(id);
		return this.baseDao.load(subject);
	}

	public List<Subject> queryAll(Subject subject) {
		return baseDao.queryForAll(subject);
	}

	public PagingResult<Subject> queryForPage(PagingParam<Subject> param) {
		return this.baseDao.queryForPage(param);
	}
}
