package com.bawei.day03_volley.HttpUtlis;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bawei.day03_volley.MainActivity;

/**
 * 类的用途：封装HttpUtils
 * Created by lushangren
 * on 2016/12/7.
 */

public class HttpUtils {

    private final RequestQueue requestQueue;
    private static HttpUtils httpUtils;//初始化一个类的对象
//    创建一个饿汉式，程序一加载就new出对象来，用单例模式，优点：不用每次new对象，节省资源
    public static HttpUtils getHttpUtils(Context context){
//        判断类是否已经被创建
        if(httpUtils==null){
            synchronized (HttpUtils.class){
                if(httpUtils==null){
                    httpUtils=new HttpUtils(context);
                }
            }
        }
        return httpUtils;
    }
//创建一个构造方法，程序一运行就请求网络
    public HttpUtils(Context context) {
        requestQueue = Volley.newRequestQueue(context);

    }

    public void requestGet(Context context, String url, Response.Listener listener, Response.ErrorListener errorListener){
        //        获取一个RequestQueue的对象
//        还需要一个StringRequest的对象，处理Http请求
        StringRequest stringRequest = new StringRequest(url,listener,errorListener );
//        将得到的StringRequest添加到请求队列
        requestQueue.add(stringRequest);
    }


}
