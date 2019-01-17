package com.lalit.weather.weatherapp.Adapters;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.lalit.weather.weatherapp.AppUtitlity.Utility;
import com.lalit.weather.weatherapp.POJO_Models.WeatherResponse;
import com.lalit.weather.weatherapp.R;

import java.util.List;

/**
 * Created by lenovo pc on 1/17/2019.
 */

public class TimeWeatherRecycleAdapter extends RecyclerView.Adapter<TimeWeatherRecycleAdapter.TimeViewHolder>{
    private List<WeatherResponse.ListBean> horizontalGrocderyList;
    Context context;

    public TimeWeatherRecycleAdapter(List<WeatherResponse.ListBean> horizontalGrocderyList, Context context){
        this.horizontalGrocderyList= horizontalGrocderyList;
        this.context = context;
        Fresco.initialize(context);
    }

    @Override
    public TimeWeatherRecycleAdapter.TimeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the layout file
        View groceryProductView = LayoutInflater.from(parent.getContext()).inflate(R.layout.time_weather_layout, parent, false);
        TimeWeatherRecycleAdapter.TimeViewHolder gvh = new TimeWeatherRecycleAdapter.TimeViewHolder(groceryProductView);
        return gvh;
    }

    @Override
    public void onBindViewHolder(TimeWeatherRecycleAdapter.TimeViewHolder holder, final int position) {
        Uri imageUri = Uri.parse("http://openweathermap.org/img/w/"+horizontalGrocderyList.get(position).getWeather().get(0).getIcon()+".png");
        String[] splitDate = horizontalGrocderyList.get(position).getDt_txt().split("-");
        String[] splitdd = splitDate[2].split(" ");
        String[] hourSplit = splitdd[1].split(":");
        holder.hour.setText(hourSplit[0]+":"+hourSplit[1]);
        holder.hourImage.setImageURI(imageUri);
        holder.temp.setText(""+horizontalGrocderyList.get(position).getMain().getTemp());
    }

    @Override
    public int getItemCount() {
        return horizontalGrocderyList.size();
    }

    public class TimeViewHolder extends RecyclerView.ViewHolder {
        SimpleDraweeView hourImage;
        TextView hour , temp;
        public TimeViewHolder(View view) {
            super(view);
            hourImage = view.findViewById(R.id.hourImage);
            hour = view.findViewById(R.id.hour);
            temp = view.findViewById(R.id.temp);
        }
    }
}

