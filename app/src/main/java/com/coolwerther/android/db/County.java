package com.coolwerther.android.db;

/**
 * Created by pcy on 2018/11/22.
 */

public class County {
    private int id;
    private String countyName;
    private String wertherId;
    private int cityId;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
    public String getWeatherId() {
        return wertherId;
    }

    public void setWertherId(String wertherId) {
        this.wertherId = wertherId;
    }
    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

}
