package clase9.laboratorio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public interface UtilidadesFecha {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	static String getLocalDateAsString(LocalDate fecha) {
		return sdf.format(Date.from(fecha.atStartOfDay(ZoneId.systemDefault()).toInstant()));
	}

	static LocalDate getStringAsLocalDate(String fecha) throws ParseException {
		return sdf.parse(fecha).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	static String getDateAsString(Date fecha) {
		return sdf.format(fecha);
	}

	static Date getStringAsDate(String fecha) throws ParseException {
		return sdf.parse(fecha);
	}

}
