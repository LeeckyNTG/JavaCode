package com.clover.InterfaceCallBack;

public class Main {

    public static void main(String[] args) {

        WeatherUtils weatherUtils = new WeatherUtils();
        weatherUtils.getWeather("北京", new IWeatherUtils.CallBack() {
            @Override
            public void success(Weather weather) {
                System.out.println(weather.getMsg());
            }

            @Override
            public void error(String msg) {
                System.out.println(msg);
            }
        });

    }
}
