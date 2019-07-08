package com.karlsen.mail.config.database;

/**
 * @author sauyer
 * @date 2019/7/8 19:54
 */
public class DataBaseContextHolder {
    public enum DataBaseType {
        MASTER, SLAVE
    }

    private static final ThreadLocal<DataBaseType> contextHolder = new ThreadLocal<DataBaseType>();


    public static void setDataBaseType(DataBaseType dataBaseType) {
        if (dataBaseType == null) throw new NullPointerException();
        contextHolder.set(dataBaseType);
    }

    public static DataBaseType getDataBaseType() {
        return contextHolder.get() == null ? DataBaseType.MASTER : contextHolder.get();
    }

    public static void clearDataBaseType() {
        contextHolder.remove();
    }

}
