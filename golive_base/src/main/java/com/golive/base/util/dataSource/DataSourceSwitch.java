package com.golive.base.util.dataSource;

public class DataSourceSwitch {

    @SuppressWarnings({"rawtypes"})
    private static final ThreadLocal contextHolder = new ThreadLocal();

    @SuppressWarnings("unchecked")
    public static void setDataSource(String dataSource) {
        contextHolder.set(dataSource);
    }

    @SuppressWarnings("unchecked")
    public static void setMaster() {
        contextHolder.remove();
        contextHolder.set("master");
    }

    @SuppressWarnings("unchecked")
    public static void setSlave() {
        contextHolder.remove();
        contextHolder.set("slave");
    }

    /***/
    @SuppressWarnings("unchecked")
    public static void setBehavior() {
        contextHolder.remove();
        contextHolder.set("behavior");
    }

    public static String getDataSouce() {
        if (contextHolder.get() == null) {
            DataSourceSwitch.setMaster();
        }
        return contextHolder.get().toString();
    }
}