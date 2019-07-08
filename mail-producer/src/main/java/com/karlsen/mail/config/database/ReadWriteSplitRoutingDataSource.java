package com.karlsen.mail.config.database;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author sauyer
 * @date 2019/7/8 20:00
 */
public class ReadWriteSplitRoutingDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataBaseContextHolder.getDataBaseType();
    }
}
