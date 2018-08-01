package com.orm.sorm.core;

public class QueryFactory {

    private static MySqlQuery prototypeObj;     //prototype Object

    static {
        try {
            Class c=Class.forName(DBManager.getConf().getQueryClass());
            prototypeObj = (MySqlQuery) c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }

//        load po all class
        TableContext.loadPOTables();
    }

    private QueryFactory(){
//        私有构造器
    }

    public static Query createQuery(){
        try {
            return (MySqlQuery) prototypeObj.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}
