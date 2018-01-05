package com.cmb.okr.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

import com.cmb.okr.frame.base.JsonResponse;

/**
 * controller 基类
 * 
 * @author hf
 *
 */
public class BaseController {

	private static Logger logger = LoggerFactory.getLogger(BaseController.class);

	/**
	 * 业务操作
	 * 
	 * @param callback
	 * @param msg
	 * @return
	 */
	protected JsonResponse doBusiness(ControllerCallBack callback, String msg) {
		JsonResponse res = new JsonResponse();
		try {
			callback.doBusiness(res);
		} catch (Exception e) {
			res.setCode(HttpStatus.INTERNAL_SERVER_ERROR.toString());
			logger.error(msg, e);
			res.setMsg(msg);
		}
		return res;
	}

	@FunctionalInterface
	public interface ControllerCallBack {
		public abstract void doBusiness(JsonResponse res);
	}
}
