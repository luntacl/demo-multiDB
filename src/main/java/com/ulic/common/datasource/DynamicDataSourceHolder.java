package com.ulic.common.datasource;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liutao on 2017/5/26.
 */
public class DynamicDataSourceHolder {

    private static final ThreadLocal<String> THREAD_DATA_SOURCE = new ThreadLocal<>();

    public static List<String> dataSourceIds = new ArrayList<>();

    public static String getDataSource() {
        return THREAD_DATA_SOURCE.get();
    }

    public static void setDataSource(String dataSource) {
        THREAD_DATA_SOURCE.set(dataSource);
    }

    public static void clearDataSource() {
        THREAD_DATA_SOURCE.remove();
    }
    public static boolean containsDataSource(String dataSourceId){
        return dataSourceIds.contains(dataSourceId);
    }
}
