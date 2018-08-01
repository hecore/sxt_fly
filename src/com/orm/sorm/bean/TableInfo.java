package com.orm.sorm.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * save table msg
 */
public class TableInfo {

    /**
     * table name
     */
    private  String tname;

    /**
     * all field msg
     */
    private Map<String,ColumnInfo> columns;

    private ColumnInfo onlyPrikey;

//    union key
    private List<ColumnInfo> priKeys;


    public TableInfo(String tname, Map<String, ColumnInfo> columns,
                     ColumnInfo onlyPriKey) {
        super();
        this.tname = tname;
        this.columns = columns;
        this.onlyPrikey = onlyPriKey;
    }

    public TableInfo(String tname,List<ColumnInfo> priKeys, Map<String, ColumnInfo> columns
    ) {
        super();
        this.tname = tname;
        this.columns = columns;
        this.priKeys = priKeys;
    }

    public TableInfo(String tname, Map<String, ColumnInfo> columns, ColumnInfo onlyPrikey, List<ColumnInfo> priKeys) {
        this.tname = tname;
        this.columns = columns;
        this.onlyPrikey = onlyPrikey;
        this.priKeys = priKeys;
    }

    public String getTname() {

        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Map<String, ColumnInfo> getColumns() {
        return columns;
    }

    public void setColumns(Map<String, ColumnInfo> columns) {
        this.columns = columns;
    }

    public ColumnInfo getOnlyPrikey() {
        return onlyPrikey;
    }

    public void setOnlyPrikey(ColumnInfo onlyPrikey) {
        this.onlyPrikey = onlyPrikey;
    }

    public List<ColumnInfo> getPriKeys() {
        return priKeys;
    }

    public void setPriKeys(List<ColumnInfo> priKeys) {
        this.priKeys = priKeys;
    }

}
