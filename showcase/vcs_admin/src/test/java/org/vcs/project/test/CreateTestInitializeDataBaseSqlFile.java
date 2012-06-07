package org.vcs.project.test;

import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.ImprovedNamingStrategy;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class CreateTestInitializeDataBaseSqlFile {
	
	public static void main(String[] args) {
		
		SchemaExport export = new SchemaExport(new Configuration().configure().setNamingStrategy(new ImprovedNamingStrategy()));
		
		export.setOutputFile("src/test/resources/h2schma.sql");
		
		export.create(true,false);
	}
}
