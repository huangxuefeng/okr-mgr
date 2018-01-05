package com.cmb.okr.frame.util;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import org.springframework.util.ReflectionUtils;

import com.cmb.okr.frame.exception.AppException;

public class ReflectUtils {

	private static final List<String> PRIMITIVE_TYPE = Arrays.asList("Boolean", "Character", "Byte", "Short", "Integer",
			"Long", "Float", "Double", "String", "BigDecimal");

	public static boolean isPrimitiveTypes(Class<?> clazz) {
		String className = clazz.getSimpleName();
		return PRIMITIVE_TYPE.contains(className);
	}

	public static void setField(Object target, String fieldName, Object val) {
		try {
			Field f = ReflectionUtils.findField(target.getClass(), fieldName);
			if (f == null) {
				return;
			}
			f.setAccessible(true);
			f.set(target, val);
		} catch (Exception e) {
			throw new AppException("反射赋值出错", e);
		}
	}
}
