package net.ptcs.demo.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class CustomerDateConverter implements Converter<String,Date> {
	@Override
	public Date convert(String source) {
		Date date=null;
		if(source!=null && !"".equals(source))
		{
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			try {
				date=sdf.parse(source);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return date;
	}
}