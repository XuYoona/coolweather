package com.example.xuhui.coolweather.db;

import android.support.v4.app.ActivityCompat;

/**
 * Created by xuhui on 2017/9/2.
 */

public class Province extends ActivityCompat{
    private  int id;
    private  String provinceName;
    private  int provinceCode;
    public  int getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public  void setProvinceName(String provinceName){
        this.provinceName=provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }
}
