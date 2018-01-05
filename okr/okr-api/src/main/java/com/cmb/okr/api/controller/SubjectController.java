package com.cmb.okr.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cmb.okr.api.BaseController;
import com.cmb.okr.dao.domain.Subject;
import com.cmb.okr.frame.base.JsonResponse;
import com.cmb.okr.frame.db.PagingParam;
import com.cmb.okr.service.SubjectService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Api("课题管理API测试类")
@RestController
@RequestMapping("/subject")
public class SubjectController extends BaseController {

	@Autowired
	SubjectService subjectService;

	@ApiOperation(value = "新增课题", notes = "")
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public JsonResponse insert(@RequestBody Subject subject) {

		return doBusiness((res) -> {
			Subject sub = subjectService.insert(subject);
			res.setResult(sub);
		}, "新建课题失败");

	}

	@ApiOperation(value = "更新课题", notes = "")
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public JsonResponse update(@RequestBody Subject subject) {
		return doBusiness((res) -> {
			subjectService.update(subject);
		}, "课题更新失败");

	}

	@ApiOperation(value = "删除课题", notes = "")
	@ApiImplicitParam(paramType = "path", required = true, name = "id")
	@RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
	public JsonResponse delete(@PathVariable("id") String id) {

		return doBusiness((res) -> {
			subjectService.delete(id);
		}, "课题删除失败");
	}

	@ApiOperation(value = "获取课题", notes = "")
	@ApiImplicitParam(paramType = "path", required = true, name = "id")
	@RequestMapping(value = "load/{id}", method = RequestMethod.POST)
	public JsonResponse load(@PathVariable("id") String id) {
		return doBusiness((res) -> {
			res.setResult(subjectService.load(id));
		}, "课题获取失败");

	}

	@ApiOperation(value = "课题分页查询", notes = "")
	@RequestMapping(value = "paging", method = RequestMethod.POST)
	public JsonResponse queryForPage(@RequestBody PagingParam<Subject> param) {
		return doBusiness((res) -> {
			res.setResult(subjectService.queryForPage(param));
		}, "课题获取失败");
	}
}
