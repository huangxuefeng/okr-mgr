package com.cmb.okr.codegen.generator;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.cmb.okr.codegen.VelocityUtil;
import com.cmb.okr.codegen.bean.Context;
import com.cmb.okr.codegen.db.Table;

/**
 * TODO
 * @author: guohm 
 * @date:2015年1月12日 下午11:08:38
 * @since 1.0.0
 */
public class EntityGenerator extends AbstractGenerator {

	/* (non-Javadoc)
	 * @see com.dd.codegen.ICodeGenerator#generate(com.dd.codegen.db.Table, com.dd.codegen.bean.Context)
	 */
	@Override
	public void generate(Table table, Context context)throws Exception{
		Map<String, Context> data = new HashMap<String, Context>();
		data.put("data", context);
		String filePath = this.getFilePath(table, context);
		File file = new File(filePath);
		File pFile = file.getParentFile();
		if (!pFile.exists()) {
			pFile.mkdirs();
		}
		if(!file.exists()){
			file.createNewFile();
		}else{
			file.delete();
			file.createNewFile();
		}
		VelocityUtil.renderFile("entity.vm", filePath,  data);
	}

	
	private String getFilePath(Table table, Context context) {
		String filePath = super.getFilePath(table);
		String packagePath = super.getPackagePath(table);
		StringBuilder path = new StringBuilder(filePath);
		path.append(packagePath)
			.append("/")
			.append(context.getEntity().getClazzName())
			.append(".java");
		return path.toString();
	}
	
	
}
