package com.lalit.weather.weatherapp;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.lalit.weather.weatherapp.SessionManager.SessionManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import bolts.Task;

public class SplashActivity extends Activity {

    static String lats, lngs;

    Double lat, lng;
    Geocoder geo;
    SessionManager sm ;
    private static int SPLASH_TIME_OUT = 2000;
    String[] permissions = new String[]{
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.INTERNET,
            Manifest.permission.ACCESS_NETWORK_STATE};
    private int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        sm = new SessionManager(SplashActivity.this);



        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                if(checkPermissions()){
                 getCurrentLocation();
                }

            }
        }, SPLASH_TIME_OUT);


    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {

        switch (requestCode) {
            case 1: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    getCurrentLocation();
// all permissions are granted.
                } else {

//permissions missing

                }
                return;
            }

        }}

    private boolean checkPermissions() {
        int result;
        List<String> listPermissionsNeeded = new ArrayList<>();
        for (String p : permissions) {
            result = ContextCompat.checkSelfPermission(SplashActivity.this, p);
            if (result != PackageManager.PERMISSION_GRANTED) {
                listPermissionsNeeded.add(p);
            }
        }
        if (!listPermissionsNeeded.isEmpty()) {
            ActivityCompat.requestPermissions(this, listPermissionsNeeded.toArray(new String[listPermissionsNeeded.size()]), REQUEST_CODE);
            return false;
        }
        return true;
    }


    public void getCurrentLocation() {
        final LocationManager locationManager;
        LocationListener listener = null;
        String context = Context.LOCATION_SERVICE;
        locationManager = (LocationManager) getSystemService(context);
        Criteria crta = new Criteria();
        crta.setAccuracy(Criteria.ACCURACY_FINE);
        crta.setAltitudeRequired(false);
        crta.setBearingRequired(false);
        crta.setCostAllowed(true);
        crta.setPowerRequirement(Criteria.POWER_LOW);
        String provider = locationManager.getBestProvider(crta, true);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }



        listener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {

                if (location != null) {
                    lat = location.getLatitude();
                    lng = location.getLongitude();
                    if (lat != 0.0 && lng != 0.0) {
                        System.out.println("WE GOT THE LOCATION");
                        System.out.println(lat);
                        System.out.println(lng);
                        lats = String.valueOf(lat);
                        lngs = String.valueOf(lng);
                        //tv.setText(""+lat+""+lng);
                        geo = new Geocoder(getApplicationContext(), Locale.ENGLISH);
                        try {
                            List<Address> mylist = geo.getFromLocation(lat, lng, 10);
                            Address mynearadd = mylist.get(0);

                            Log.e("addes",""+mylist.get(0).getSubLocality());
                            Log.e("phone",""+mylist.get(0).getPhone());
                            Log.e("adminarea",""+mylist.get(0).getAdminArea());
                            Log.e("adminarea",""+mylist.get(0).getCountryName());
                            Log.e("addreline",""+mylist.get(0).getAddressLine(0));
                            Log.e("adminarea",""+mylist.get(0).getLocality());

                            sm.createLoginSession(""+lat , ""+lng ,mylist.get(0).getAddressLine(0));

                            locationManager.removeUpdates(this);

                            Intent i = new Intent(SplashActivity.this, MainActivity.class);
                            startActivity(i);
                            finish();

                        } catch (Exception e) {
                            e.printStackTrace();
                        }




                    }
                }

            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {

            }

            @Override
            public void onProviderDisabled(String provider) {

            }
        };

        locationManager.requestLocationUpdates(provider, 0, 1,
                listener);

    }



}
