package com.lalit.weather.weatherapp;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.androidnetworking.error.ANError;
import com.google.gson.Gson;
import com.lalit.weather.weatherapp.Adapters.RecyclerViewHorizontalListAdapter;
import com.lalit.weather.weatherapp.Adapters.TimeWeatherRecycleAdapter;
import com.lalit.weather.weatherapp.ApiManager.ApiManager;
import com.lalit.weather.weatherapp.POJO_Models.WeatherResponse;
import com.lalit.weather.weatherapp.SessionManager.SessionManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.view.LineChartView;

public class MainActivity extends AppCompatActivity {

    ApiManager apiManager ;
    SessionManager sm ;
    String weather_url ;
    String GetWeatherTag = "GetWeather" ;
    LinearLayout content_layout ;
    TextView current_Temp, address ;
    TextView maxMin, eastWind , humidity , visiblity , pressure ;
    private RecyclerView weatherRecyclerView;
    private RecyclerView hourweatherRecyclerView;
    LineChartView lineChartView,lineChartView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sm = new SessionManager(MainActivity.this);
        content_layout = (LinearLayout)findViewById(R.id.content);
        current_Temp = (TextView)findViewById(R.id.current_temp);
        maxMin = (TextView)findViewById(R.id.max_min_temp);
        weatherRecyclerView = (RecyclerView)findViewById(R.id.idRecyclerViewHorizontal);
        hourweatherRecyclerView = (RecyclerView)findViewById(R.id.time_recycler_view);
        lineChartView = findViewById(R.id.chart);
        lineChartView2 = findViewById(R.id.chart2);
        address = findViewById(R.id.toolbar_location);
        eastWind = findViewById(R.id.east_wind);
        humidity = findViewById(R.id.humidity);
        visiblity = findViewById(R.id.visiblity);
        pressure = findViewById(R.id.pressure);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.location);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        apiManager = new ApiManager(MainActivity.this , apifetcher);


        HashMap<String , String> Loc_details = new HashMap<>();
        Loc_details = sm.getUserDetails();
        address.setText(Loc_details.get(SessionManager.USER_add));

        weather_url = "http://api.openweathermap.org/data/2.5/forecast?lat="+Loc_details.get(SessionManager.USER_lat)+"&lon="+Loc_details.get(SessionManager.USER_lng)+"&APPID=491a82678e4fb08add1d4b2ee84cd82a&units=Metric" ;

        apiManager.Execution_method_get(GetWeatherTag , weather_url);
    }


    ApiManager.APIFETCHER apifetcher = new ApiManager.APIFETCHER() {
        @Override
        public void onAPIRunningState(int a) {

        }

        @Override
        public void onFetchProgress(int progress) {

        }

        @Override
        public void onFetchComplete(String script, String APINAME, Gson gson) {

        if(APINAME.equals(GetWeatherTag)){
            Log.e("Weather Res:- " , script);
            WeatherResponse weatherResponse = new WeatherResponse();
            weatherResponse = gson.fromJson(script , WeatherResponse.class);
            if(weatherResponse.getCod().equals("200")){
             current_Temp.setText(""+weatherResponse.getList().get(0).getMain().getTemp()+(char) 0x00B0);
             maxMin.setText(weatherResponse.getList().get(0).getWeather().get(0).getMain()+" " +weatherResponse.getList().get(0).getMain().getTemp_max()+" / "+weatherResponse.getList().get(0).getMain().getTemp_min()+(char) 0x00B0+"C");
             eastWind.setText(""+weatherResponse.getList().get(0).getWind().getSpeed()+"km/h");
             humidity.setText(""+weatherResponse.getList().get(0).getMain().getHumidity()+"%");
             pressure.setText(""+weatherResponse.getList().get(0).getMain().getPressure()+"hpa");


             List<WeatherResponse.ListBean> DatesWeather = new ArrayList<>();
             List<WeatherResponse.ListBean> TimesWeather = new ArrayList<>();
             ArrayList<String> onlydd = new ArrayList<>();
             for(int i = 0 ; i < weatherResponse.getList().size() ; i++){
                 String[] onlyDate = weatherResponse.getList().get(i).getDt_txt().split(" ");
                 if(onlydd.contains(onlyDate[0])){

                 }else {
                     for (int j = 0; j < weatherResponse.getList().size() ; j++){
                         String[] onlyDate1 = weatherResponse.getList().get(i).getDt_txt().split(" ");
                         if(onlyDate[0].equals(onlyDate1[0])){
                             TimesWeather.add(weatherResponse.getList().get(j));
                         }
                     }
                     onlydd.add(onlyDate[0]);
                     DatesWeather.add(weatherResponse.getList().get(i));

                 }

             }

                List yAxisValues = new ArrayList();
                List yAxisValues2 = new ArrayList();
                for (int i = 0; i < DatesWeather.size(); i++) {
                    PointValue p = new PointValue(i, (float) DatesWeather.get(i).getMain().getTemp_max());
                    p.setLabel(""+DatesWeather.get(i).getMain().getTemp_max());
                    yAxisValues.add(p);
                }


                for (int i = 0; i < DatesWeather.size(); i++) {
                    PointValue p1 = new PointValue(i, (float) DatesWeather.get(i).getMain().getTemp_min());
                    p1.setLabel(""+DatesWeather.get(i).getMain().getTemp_min());
                    yAxisValues2.add(p1);
                }
                Line line = new Line(yAxisValues).setColor(Color.parseColor("#3B5998"));
                Line line2 = new Line(yAxisValues2).setColor(Color.parseColor("#9C87B0"));
                line.setStrokeWidth(1);
                line.setHasLabelsOnlyForSelected(true);
                line2.setHasLabelsOnlyForSelected(true);
                line.setValues(yAxisValues);
                line2.setValues(yAxisValues2);
                line2.setStrokeWidth(1);

                List lines = new ArrayList();
                lines.add(line);
                LineChartData data = new LineChartData();
                data.setLines(lines);
                List lines2 = new ArrayList();
                lines2.add(line2);
                LineChartData data2 = new LineChartData();
                data2.setLines(lines2);

             RecyclerViewHorizontalListAdapter groceryAdapter = new RecyclerViewHorizontalListAdapter(DatesWeather, getApplicationContext());
             LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
             weatherRecyclerView.setLayoutManager(horizontalLayoutManager);
             weatherRecyclerView.setAdapter(groceryAdapter);

                lineChartView.setLineChartData(data);
                Viewport viewport = new Viewport(lineChartView.getMaximumViewport());
                viewport.top = 25;
                lineChartView.setMaximumViewport(viewport);
                lineChartView.setCurrentViewport(viewport);

                lineChartView2.setLineChartData(data2);
                Viewport viewport2 = new Viewport(lineChartView2.getMaximumViewport());
                viewport2.top = 15;
                lineChartView2.setMaximumViewport(viewport2);
                lineChartView2.setCurrentViewport(viewport2);


             TimeWeatherRecycleAdapter timeAdapter = new TimeWeatherRecycleAdapter(TimesWeather, getApplicationContext());
             LinearLayoutManager horizontalLayoutManager1 = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
             hourweatherRecyclerView.setLayoutManager(horizontalLayoutManager1);
             hourweatherRecyclerView.setAdapter(timeAdapter);

             content_layout.setVisibility(View.VISIBLE);

            }

        }

        }

        @Override
        public void onFetchFailed(ANError error) {

        }

        @Override
        public void WhichApi(String APINAME) {

        }
    };

}
