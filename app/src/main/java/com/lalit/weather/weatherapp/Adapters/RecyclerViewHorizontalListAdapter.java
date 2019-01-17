package com.lalit.weather.weatherapp.Adapters;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.lalit.weather.weatherapp.AppUtitlity.Utility;
import com.lalit.weather.weatherapp.POJO_Models.WeatherResponse;
import com.lalit.weather.weatherapp.R;

import java.util.List;

/**
 * Created by lenovo pc on 1/17/2019.
 */

public class RecyclerViewHorizontalListAdapter extends RecyclerView.Adapter<RecyclerViewHorizontalListAdapter.GroceryViewHolder>{
    private List<WeatherResponse.ListBean> horizontalGrocderyList;
    Context context;

    public RecyclerViewHorizontalListAdapter(List<WeatherResponse.ListBean> horizontalGrocderyList, Context context){
        this.horizontalGrocderyList= horizontalGrocderyList;
        this.context = context;
        Fresco.initialize(context);
    }

    @Override
    public GroceryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the layout file
        View groceryProductView = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_list_item, parent, false);
        GroceryViewHolder gvh = new GroceryViewHolder(groceryProductView);
        return gvh;
    }

    @Override
    public void onBindViewHolder(GroceryViewHolder holder, final int position) {
        Uri imageUri = Uri.parse("http://openweathermap.org/img/w/"+horizontalGrocderyList.get(position).getWeather().get(0).getIcon()+".png");
        holder.imageView.setImageURI(imageUri);
        String[] splitDate = horizontalGrocderyList.get(position).getDt_txt().split("-");
        String[] splitdd = splitDate[2].split(" ");
        holder.date.setText(splitDate[1]+"/"+splitdd[0]);
        holder.day.setText(Utility.GetDayFromDate(horizontalGrocderyList.get(position).getDt_txt()));

    }

    @Override
    public int getItemCount() {
        return horizontalGrocderyList.size();
    }

    public class GroceryViewHolder extends RecyclerView.ViewHolder {
        SimpleDraweeView  imageView;
        TextView day , date ;
        public GroceryViewHolder(View view) {
            super(view);
            imageView=view.findViewById(R.id.sdvImage);
            day=view.findViewById(R.id.day);
            date=view.findViewById(R.id.date);

        }
    }
}
