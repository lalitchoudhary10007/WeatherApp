package com.lalit.weather.weatherapp.POJO_Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lenovo pc on 1/17/2019.
 */

public class WeatherResponse {


    /**
     * cod : 200
     * message : 0.007
     * cnt : 40
     * list : [{"dt":1547672400,"main":{"temp":45.03,"temp_min":41.43,"temp_max":45.03,"pressure":1001.34,"sea_level":1031.47,"grnd_level":1001.34,"humidity":83,"temp_kf":2},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":2.75,"deg":63.5006},"sys":{"pod":"n"},"dt_txt":"2019-01-16 21:00:00"},{"dt":1547683200,"main":{"temp":42.13,"temp_min":39.44,"temp_max":42.13,"pressure":1001.14,"sea_level":1031.39,"grnd_level":1001.14,"humidity":82,"temp_kf":1.5},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":2.73,"deg":22.5004},"sys":{"pod":"n"},"dt_txt":"2019-01-17 00:00:00"},{"dt":1547694000,"main":{"temp":45.75,"temp_min":43.96,"temp_max":45.75,"pressure":1002.31,"sea_level":1032.42,"grnd_level":1002.31,"humidity":82,"temp_kf":1},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":2.39,"deg":357.008},"sys":{"pod":"d"},"dt_txt":"2019-01-17 03:00:00"},{"dt":1547704800,"main":{"temp":67.06,"temp_min":66.16,"temp_max":67.06,"pressure":1002.84,"sea_level":1032.03,"grnd_level":1002.84,"humidity":53,"temp_kf":0.5},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":4.61,"deg":332.001},"sys":{"pod":"d"},"dt_txt":"2019-01-17 06:00:00"},{"dt":1547715600,"main":{"temp":71.8,"temp_min":71.8,"temp_max":71.8,"pressure":1000.57,"sea_level":1029.51,"grnd_level":1000.57,"humidity":45,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":4.7,"deg":1.50333},"sys":{"pod":"d"},"dt_txt":"2019-01-17 09:00:00"},{"dt":1547726400,"main":{"temp":67.71,"temp_min":67.71,"temp_max":67.71,"pressure":1000.15,"sea_level":1029.14,"grnd_level":1000.15,"humidity":39,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.94,"deg":345.009},"sys":{"pod":"d"},"dt_txt":"2019-01-17 12:00:00"},{"dt":1547737200,"main":{"temp":52.69,"temp_min":52.69,"temp_max":52.69,"pressure":1001.74,"sea_level":1031.44,"grnd_level":1001.74,"humidity":73,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":7.29,"deg":352.005},"sys":{"pod":"n"},"dt_txt":"2019-01-17 15:00:00"},{"dt":1547748000,"main":{"temp":44.61,"temp_min":44.61,"temp_max":44.61,"pressure":1002.4,"sea_level":1032.53,"grnd_level":1002.4,"humidity":85,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":3.18,"deg":335.004},"sys":{"pod":"n"},"dt_txt":"2019-01-17 18:00:00"},{"dt":1547758800,"main":{"temp":40.91,"temp_min":40.91,"temp_max":40.91,"pressure":1002.39,"sea_level":1032.64,"grnd_level":1002.39,"humidity":79,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":3.4,"deg":321.001},"sys":{"pod":"n"},"dt_txt":"2019-01-17 21:00:00"},{"dt":1547769600,"main":{"temp":38.59,"temp_min":38.59,"temp_max":38.59,"pressure":1002.36,"sea_level":1032.73,"grnd_level":1002.36,"humidity":81,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":3.71,"deg":281},"sys":{"pod":"n"},"dt_txt":"2019-01-18 00:00:00"},{"dt":1547780400,"main":{"temp":43.8,"temp_min":43.8,"temp_max":43.8,"pressure":1003.79,"sea_level":1034.05,"grnd_level":1003.79,"humidity":81,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.71,"deg":260.5},"sys":{"pod":"d"},"dt_txt":"2019-01-18 03:00:00"},{"dt":1547791200,"main":{"temp":66.06,"temp_min":66.06,"temp_max":66.06,"pressure":1004.28,"sea_level":1033.59,"grnd_level":1004.28,"humidity":56,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":4.54,"deg":296.503},"sys":{"pod":"d"},"dt_txt":"2019-01-18 06:00:00"},{"dt":1547802000,"main":{"temp":72.51,"temp_min":72.51,"temp_max":72.51,"pressure":1001.56,"sea_level":1030.54,"grnd_level":1001.56,"humidity":46,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":4.61,"deg":338.503},"sys":{"pod":"d"},"dt_txt":"2019-01-18 09:00:00"},{"dt":1547812800,"main":{"temp":68.15,"temp_min":68.15,"temp_max":68.15,"pressure":1001.11,"sea_level":1030.18,"grnd_level":1001.11,"humidity":37,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.15,"deg":348.01},"sys":{"pod":"d"},"dt_txt":"2019-01-18 12:00:00"},{"dt":1547823600,"main":{"temp":53.13,"temp_min":53.13,"temp_max":53.13,"pressure":1002.39,"sea_level":1032.14,"grnd_level":1002.39,"humidity":74,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":6.2,"deg":7.50131},"sys":{"pod":"n"},"dt_txt":"2019-01-18 15:00:00"},{"dt":1547834400,"main":{"temp":45.85,"temp_min":45.85,"temp_max":45.85,"pressure":1002.7,"sea_level":1032.73,"grnd_level":1002.7,"humidity":84,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":20},"wind":{"speed":2.75,"deg":4.00232},"sys":{"pod":"n"},"dt_txt":"2019-01-18 18:00:00"},{"dt":1547845200,"main":{"temp":44.45,"temp_min":44.45,"temp_max":44.45,"pressure":1002.16,"sea_level":1032.21,"grnd_level":1002.16,"humidity":83,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":2.71,"deg":231.502},"sys":{"pod":"n"},"dt_txt":"2019-01-18 21:00:00"},{"dt":1547856000,"main":{"temp":42.2,"temp_min":42.2,"temp_max":42.2,"pressure":1001.38,"sea_level":1031.48,"grnd_level":1001.38,"humidity":82,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":32},"wind":{"speed":2.71,"deg":258.003},"sys":{"pod":"n"},"dt_txt":"2019-01-19 00:00:00"},{"dt":1547866800,"main":{"temp":47.06,"temp_min":47.06,"temp_max":47.06,"pressure":1002.59,"sea_level":1032.58,"grnd_level":1002.59,"humidity":81,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"02d"}],"clouds":{"all":8},"wind":{"speed":2.48,"deg":231.002},"sys":{"pod":"d"},"dt_txt":"2019-01-19 03:00:00"},{"dt":1547877600,"main":{"temp":69.89,"temp_min":69.89,"temp_max":69.89,"pressure":1003.2,"sea_level":1032.36,"grnd_level":1003.2,"humidity":52,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":56},"wind":{"speed":4.61,"deg":197.5},"sys":{"pod":"d"},"dt_txt":"2019-01-19 06:00:00"},{"dt":1547888400,"main":{"temp":77.64,"temp_min":77.64,"temp_max":77.64,"pressure":1001.09,"sea_level":1029.93,"grnd_level":1001.09,"humidity":44,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":3.18,"deg":264.505},"sys":{"pod":"d"},"dt_txt":"2019-01-19 09:00:00"},{"dt":1547899200,"main":{"temp":73.01,"temp_min":73.01,"temp_max":73.01,"pressure":1000.18,"sea_level":1029.28,"grnd_level":1000.18,"humidity":38,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":44},"wind":{"speed":2.37,"deg":70.0001},"sys":{"pod":"d"},"dt_txt":"2019-01-19 12:00:00"},{"dt":1547910000,"main":{"temp":59.73,"temp_min":59.73,"temp_max":59.73,"pressure":1001.59,"sea_level":1031.13,"grnd_level":1001.59,"humidity":69,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":32},"wind":{"speed":6.17,"deg":89.5027},"sys":{"pod":"n"},"dt_txt":"2019-01-19 15:00:00"},{"dt":1547920800,"main":{"temp":52.33,"temp_min":52.33,"temp_max":52.33,"pressure":1001.75,"sea_level":1031.6,"grnd_level":1001.75,"humidity":89,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":36},"wind":{"speed":3.4,"deg":110.501},"sys":{"pod":"n"},"dt_txt":"2019-01-19 18:00:00"},{"dt":1547931600,"main":{"temp":49,"temp_min":49,"temp_max":49,"pressure":1001,"sea_level":1030.87,"grnd_level":1001,"humidity":85,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":64},"wind":{"speed":2.82,"deg":121.503},"sys":{"pod":"n"},"dt_txt":"2019-01-19 21:00:00"},{"dt":1547942400,"main":{"temp":48.88,"temp_min":48.88,"temp_max":48.88,"pressure":1000.26,"sea_level":1030.15,"grnd_level":1000.26,"humidity":87,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":88},"wind":{"speed":2.84,"deg":117.002},"sys":{"pod":"n"},"dt_txt":"2019-01-20 00:00:00"},{"dt":1547953200,"main":{"temp":52.01,"temp_min":52.01,"temp_max":52.01,"pressure":1001.54,"sea_level":1031.44,"grnd_level":1001.54,"humidity":87,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":80},"wind":{"speed":2.86,"deg":136.002},"sys":{"pod":"d"},"dt_txt":"2019-01-20 03:00:00"},{"dt":1547964000,"main":{"temp":68.42,"temp_min":68.42,"temp_max":68.42,"pressure":1002.23,"sea_level":1031.18,"grnd_level":1002.23,"humidity":56,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":80},"wind":{"speed":4.5,"deg":156.502},"sys":{"pod":"d"},"dt_txt":"2019-01-20 06:00:00"},{"dt":1547974800,"main":{"temp":76.78,"temp_min":76.78,"temp_max":76.78,"pressure":999.61,"sea_level":1028.44,"grnd_level":999.61,"humidity":46,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":64},"wind":{"speed":3.94,"deg":170.01},"sys":{"pod":"d"},"dt_txt":"2019-01-20 09:00:00"},{"dt":1547985600,"main":{"temp":73.32,"temp_min":73.32,"temp_max":73.32,"pressure":998.57,"sea_level":1027.54,"grnd_level":998.57,"humidity":45,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":64},"wind":{"speed":3.51,"deg":91.5031},"sys":{"pod":"d"},"dt_txt":"2019-01-20 12:00:00"},{"dt":1547996400,"main":{"temp":62.22,"temp_min":62.22,"temp_max":62.22,"pressure":999.65,"sea_level":1029.01,"grnd_level":999.65,"humidity":75,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":48},"wind":{"speed":7.63,"deg":96.0069},"sys":{"pod":"n"},"dt_txt":"2019-01-20 15:00:00"},{"dt":1548007200,"main":{"temp":58.07,"temp_min":58.07,"temp_max":58.07,"pressure":999.66,"sea_level":1029.17,"grnd_level":999.66,"humidity":85,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":56},"wind":{"speed":6.76,"deg":121},"sys":{"pod":"n"},"dt_txt":"2019-01-20 18:00:00"},{"dt":1548018000,"main":{"temp":54.98,"temp_min":54.98,"temp_max":54.98,"pressure":998.38,"sea_level":1028.03,"grnd_level":998.38,"humidity":90,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":76},"wind":{"speed":3.49,"deg":131},"sys":{"pod":"n"},"dt_txt":"2019-01-20 21:00:00"},{"dt":1548028800,"main":{"temp":54.85,"temp_min":54.85,"temp_max":54.85,"pressure":997.82,"sea_level":1027.66,"grnd_level":997.82,"humidity":87,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":92},"wind":{"speed":3.6,"deg":154.502},"sys":{"pod":"n"},"dt_txt":"2019-01-21 00:00:00"},{"dt":1548039600,"main":{"temp":57.24,"temp_min":57.24,"temp_max":57.24,"pressure":999.71,"sea_level":1029.42,"grnd_level":999.71,"humidity":85,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":88},"wind":{"speed":2.46,"deg":320.002},"sys":{"pod":"d"},"dt_txt":"2019-01-21 03:00:00"},{"dt":1548050400,"main":{"temp":68,"temp_min":68,"temp_max":68,"pressure":1000.43,"sea_level":1029.48,"grnd_level":1000.43,"humidity":61,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":76},"wind":{"speed":8.19,"deg":49.0058},"sys":{"pod":"d"},"dt_txt":"2019-01-21 06:00:00"},{"dt":1548061200,"main":{"temp":72.24,"temp_min":72.24,"temp_max":72.24,"pressure":998.02,"sea_level":1026.8,"grnd_level":998.02,"humidity":54,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"02d"}],"clouds":{"all":8},"wind":{"speed":9.55,"deg":67.0007},"sys":{"pod":"d"},"dt_txt":"2019-01-21 09:00:00"},{"dt":1548072000,"main":{"temp":70.46,"temp_min":70.46,"temp_max":70.46,"pressure":996.69,"sea_level":1025.55,"grnd_level":996.69,"humidity":56,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":48},"wind":{"speed":11.43,"deg":84.5005},"sys":{"pod":"d"},"dt_txt":"2019-01-21 12:00:00"},{"dt":1548082800,"main":{"temp":59.49,"temp_min":59.49,"temp_max":59.49,"pressure":999.06,"sea_level":1028.27,"grnd_level":999.06,"humidity":88,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":100},"wind":{"speed":4.94,"deg":198.002},"rain":{"3h":2.99},"sys":{"pod":"n"},"dt_txt":"2019-01-21 15:00:00"},{"dt":1548093600,"main":{"temp":55.87,"temp_min":55.87,"temp_max":55.87,"pressure":997.97,"sea_level":1027.8,"grnd_level":997.97,"humidity":94,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10n"}],"clouds":{"all":8},"wind":{"speed":4.72,"deg":22.509},"rain":{"3h":4.24},"sys":{"pod":"n"},"dt_txt":"2019-01-21 18:00:00"}]
     * city : {"id":1270642,"name":"Gurgaon","coord":{"lat":28.4667,"lon":77.0333},"country":"IN","population":197340}
     */

    private String cod;
    private double message;
    private int cnt;
    private CityBean city;
    private List<ListBean> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public CityBean getCity() {
        return city;
    }

    public void setCity(CityBean city) {
        this.city = city;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class CityBean {
        /**
         * id : 1270642
         * name : Gurgaon
         * coord : {"lat":28.4667,"lon":77.0333}
         * country : IN
         * population : 197340
         */

        private int id;
        private String name;
        private CoordBean coord;
        private String country;
        private int population;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CoordBean getCoord() {
            return coord;
        }

        public void setCoord(CoordBean coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public static class CoordBean {
            /**
             * lat : 28.4667
             * lon : 77.0333
             */

            private double lat;
            private double lon;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }
        }
    }

    public static class ListBean {
        /**
         * dt : 1547672400
         * main : {"temp":45.03,"temp_min":41.43,"temp_max":45.03,"pressure":1001.34,"sea_level":1031.47,"grnd_level":1001.34,"humidity":83,"temp_kf":2}
         * weather : [{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}]
         * clouds : {"all":0}
         * wind : {"speed":2.75,"deg":63.5006}
         * sys : {"pod":"n"}
         * dt_txt : 2019-01-16 21:00:00
         * rain : {"3h":2.99}
         */

        private int dt;
        private MainBean main;
        private CloudsBean clouds;
        private WindBean wind;
        private SysBean sys;
        private String dt_txt;
        private RainBean rain;
        private List<WeatherBean> weather;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public MainBean getMain() {
            return main;
        }

        public void setMain(MainBean main) {
            this.main = main;
        }

        public CloudsBean getClouds() {
            return clouds;
        }

        public void setClouds(CloudsBean clouds) {
            this.clouds = clouds;
        }

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public SysBean getSys() {
            return sys;
        }

        public void setSys(SysBean sys) {
            this.sys = sys;
        }

        public String getDt_txt() {
            return dt_txt;
        }

        public void setDt_txt(String dt_txt) {
            this.dt_txt = dt_txt;
        }

        public RainBean getRain() {
            return rain;
        }

        public void setRain(RainBean rain) {
            this.rain = rain;
        }

        public List<WeatherBean> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherBean> weather) {
            this.weather = weather;
        }

        public static class MainBean {
            /**
             * temp : 45.03
             * temp_min : 41.43
             * temp_max : 45.03
             * pressure : 1001.34
             * sea_level : 1031.47
             * grnd_level : 1001.34
             * humidity : 83
             * temp_kf : 2
             */

            private double temp;
            private double temp_min;
            private double temp_max;
            private double pressure;
            private double sea_level;
            private double grnd_level;
            private double humidity;
            private double temp_kf;

            public double getTemp() {
                return temp;
            }

            public void setTemp(double temp) {
                this.temp = temp;
            }

            public double getTemp_min() {
                return temp_min;
            }

            public void setTemp_min(double temp_min) {
                this.temp_min = temp_min;
            }

            public double getTemp_max() {
                return temp_max;
            }

            public void setTemp_max(double temp_max) {
                this.temp_max = temp_max;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getSea_level() {
                return sea_level;
            }

            public void setSea_level(double sea_level) {
                this.sea_level = sea_level;
            }

            public double getGrnd_level() {
                return grnd_level;
            }

            public void setGrnd_level(double grnd_level) {
                this.grnd_level = grnd_level;
            }

            public double getHumidity() {
                return humidity;
            }

            public void setHumidity(int humidity) {
                this.humidity = humidity;
            }

            public double getTemp_kf() {
                return temp_kf;
            }

            public void setTemp_kf(int temp_kf) {
                this.temp_kf = temp_kf;
            }
        }

        public static class CloudsBean {
            /**
             * all : 0
             */

            private int all;

            public int getAll() {
                return all;
            }

            public void setAll(int all) {
                this.all = all;
            }
        }

        public static class WindBean {
            /**
             * speed : 2.75
             * deg : 63.5006
             */

            private double speed;
            private double deg;

            public double getSpeed() {
                return speed;
            }

            public void setSpeed(double speed) {
                this.speed = speed;
            }

            public double getDeg() {
                return deg;
            }

            public void setDeg(double deg) {
                this.deg = deg;
            }
        }

        public static class SysBean {
            /**
             * pod : n
             */

            private String pod;

            public String getPod() {
                return pod;
            }

            public void setPod(String pod) {
                this.pod = pod;
            }
        }

        public static class RainBean {
            /**
             * 3h : 2.99
             */

            @SerializedName("3h")
            private double _$3h;

            public double get_$3h() {
                return _$3h;
            }

            public void set_$3h(double _$3h) {
                this._$3h = _$3h;
            }
        }

        public static class WeatherBean {
            /**
             * id : 800
             * main : Clear
             * description : clear sky
             * icon : 01n
             */

            private int id;
            private String main;
            private String description;
            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }
}
