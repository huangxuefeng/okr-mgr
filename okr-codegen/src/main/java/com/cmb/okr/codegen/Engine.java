package com.cmb.okr.codegen;

import java.util.ArrayList;
import java.util.List;

import com.cmb.okr.codegen.bean.Context;
import com.cmb.okr.codegen.cfg.Config;
import com.cmb.okr.codegen.db.DataBase;
import com.cmb.okr.codegen.db.Table;
import com.cmb.okr.codegen.generator.EntityGenerator;
import com.cmb.okr.codegen.generator.MapperGenerator;

public class Engine {

	public static void main(String[] args) throws Exception {
		// 1、初始化配置
		Config cfg = Config.init();
		DataBase db = new DataBase(cfg);
		List<Table> tables = db.getTables();
		if (tables == null || tables.isEmpty()) {
			throw new Exception("请检查配置，没有要生成代码的表");
		}

		List<String> mappers = new ArrayList<String>();
		for (Table table : tables) {
			Context context = new Context();
			context.parse(table);
			EntityGenerator eg = new EntityGenerator();
			eg.generate(table, context);
			MapperGenerator mg = new MapperGenerator();
			mg.generate(table, context);

			mappers.add("mybatis/mapper/");
			System.out.println("生成表：" + table.getTableName() + "的代码。。。");
		}
	}
}
