package com.orm.sorm.bean;

/**
 * table field msg package
 */
public class ColumnInfo {

    /**
     * field name
     */
    private String name;

    /**
     * filed data type
     */
    private String dataType;

    /*
    * field key type(zero:common key,one:primary key,two:foreign key)
    * */
    private int keyType;

    //constructor

    public ColumnInfo() {
    }

    public ColumnInfo(String name, String dataType, int keyType) {
        this.name = name;
        this.dataType = dataType;
        this.keyType = keyType;
    }

    //setter and getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public int getKeyType() {
        return keyType;
    }

    public void setKeyType(int keyType) {
        this.keyType = keyType;
    }
}
