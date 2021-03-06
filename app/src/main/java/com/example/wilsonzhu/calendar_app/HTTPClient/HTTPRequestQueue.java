package com.example.wilsonzhu.calendar_app.HTTPClient;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class HTTPRequestQueue {
    private static HTTPRequestQueue mRequestQueueInstance;
    private RequestQueue mRequestQueue;
    private static Context mContext;

    private HTTPRequestQueue(Context context) {
        mContext = context;
        mRequestQueue = getRequestQueue();
    }

    public RequestQueue getRequestQueue() {
        if (mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(mContext);
        }
        return mRequestQueue;
    }

    public static HTTPRequestQueue getRequestQueueInstance(Context context) {
        if (mRequestQueueInstance == null) {
            mRequestQueueInstance = new HTTPRequestQueue(context.getApplicationContext());
        }
        return mRequestQueueInstance;
    }

    public <T> void addToRequestQueue(Request<T> request, String tag) {
        request.setTag(tag);
        getRequestQueue().add(request);
    }
}
