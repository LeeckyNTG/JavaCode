package com.clover.InterfaceCallBack;

public class WeatherUtils implements IWeatherUtils {

    @Override
    public void getWeather(String city, CallBack callBack) {

        Weather weather = new Weather();
        weather.setCity(city);
        switch (city) {
            case "北京": {
                String msg = city + "今天雾霾严重，空气质量差，建议在家刷剧玩游戏！";
                weather.setMsg(msg);
                callBack.success(weather);
                break;
            }
            case "广州": {
                String msg = city + "今天晴朗，空气质量优，适合出行！";
                weather.setMsg(msg);
                callBack.success(weather);
                break;
            }
            case "上海": {
                String msg = city + "今天有大暴雨，建议出门带伞！";
                weather.setMsg(msg);
                callBack.success(weather);
                break;
            }
            case "深圳": {
                String msg = city + "今天高温，建议在家吹空调！";
                weather.setMsg(msg);
                callBack.success(weather);
                break;
            }
            default: {
                callBack.error(city + "天气获取失败！");
            }
        }
    }
}
