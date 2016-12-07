package com.bawei.day03_volley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bawei.day03_volley.HttpUtlis.HttpUtils;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    private RequestQueue requestQueue;
    private String url="http://m.yunifang.com/yunifang/mobile/home?random=59676&encode=62d458fefce9c740359873cc19b05188";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HttpUtils httpUtils = new HttpUtils();
        httpUtils.requestGet(this, url, new Listener() {
            @Override
            public void onResponse(Object o) {

            }
        },new Response.ErrorListener(){

            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        });
    }
}
