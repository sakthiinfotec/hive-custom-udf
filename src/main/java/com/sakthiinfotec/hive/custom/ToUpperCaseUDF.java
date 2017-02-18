package com.sakthiinfotec.hive.custom;

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

/**
 * Custom upper case conversion UDF.
 * 
 * @author Sakthi
 */
@Description(name = "ToUpperCaseUDF", value = "Returns upper case of a given string", extended = "SELECT toUpperCase('Hello World!');")
public class ToUpperCaseUDF extends UDF {

	private Text result = new Text();

	public Text evaluate(Text str) {
		if (str == null) {
			return null;
		}
		result.set(str.toString().toUpperCase());
		return result;
	}

}
