package com.lalit.weather.weatherapp.AppUtitlity;

import android.view.View;
import android.view.ViewParent;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by lenovo pc on 1/17/2019.
 */

public class Utility {

    public static void clearParentsBackgrounds(View view) {
        while (view != null) {
            final ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
                view.setBackgroundResource(android.R.color.transparent);
            } else {
                view = null;
            }
        }
    }

   public static String GetDayFromDate(String d){
        String dayOfTheWeek = "" ;
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
       try {
           Date date = format.parse(d);
           SimpleDateFormat sdf = new SimpleDateFormat("EEE");
           dayOfTheWeek = sdf.format(date);

       } catch (ParseException e) {
           e.printStackTrace();
       }

       return dayOfTheWeek ;
    }

}
