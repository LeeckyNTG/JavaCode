package com.clover.InterfaceCallBack;

public interface IWeatherUtils {

    void getWeather(String city, CallBack callBack);

    interface CallBack {
        void success(Weather weather);

        void error(String msg);
    }
}
