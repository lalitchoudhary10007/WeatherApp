package com.lalit.weather.weatherapp.SessionManager;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashMap;

/**
 * Created by lenovo pc on 1/18/2019.
 */

public class SessionManager {

    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;
    int PRIVATE_MODE = 0;
    private static final String PREF_NAME = "LoginPrefrences";
    private static final String IS_LOGIN = "IsLoggedIn";

    public static final String USER_lat = "latitude";
    public static final String USER_lng = "longitude";
    public static final String USER_add = "address";



    public SessionManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }


//    public void setDeviceId(String device_id){
//        editor.putString(USER_DEVICE_ID, device_id);
//        editor.commit();
//    }

    public void createLoginSession(String lat , String lng , String add) {


        editor.putBoolean(IS_LOGIN, true);
        editor.putString(USER_add, add);
        editor.putString(USER_lat, lat);
        editor.putString(USER_lng, lng);


        editor.commit();
    }





    public HashMap<String, String> getUserDetails() {
        HashMap<String, String> user = new HashMap<>();
        user.put(USER_lng, pref.getString(USER_lng, ""));
        user.put(USER_lat, pref.getString(USER_lat, ""));
        user.put(USER_add, pref.getString(USER_add, ""));

        return user;
    }





    public boolean isLoggedIn() {
        return pref.getBoolean(IS_LOGIN, false);
    }

    public void logoutUser() {
        editor.clear();
        editor.commit();
    }
}



