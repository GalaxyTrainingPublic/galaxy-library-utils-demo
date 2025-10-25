package pe.edu.galaxy.training.java.library.utils.string;

import static java.util.Objects.isNull;

public final class DataUtil {

    public static String getDefaultValue(String val){
        return isNull(val)?"-":val;
    }

}
