package pe.edu.galaxy.training.java.library.utils.sql;

import static java.util.Objects.isNull;

public final class SQLUtil {

	public static String getLike(String str, PositionEnum postion) {
		if (isNull(str)) {
			str="";
		}
		return
			switch (postion){
				case LETF -> str.concat("%");
				case RIGHT -> "%".concat(str);
				case BETWEEN -> "%".concat(str).concat("%");
				default -> str;
		};
	}
	
}
