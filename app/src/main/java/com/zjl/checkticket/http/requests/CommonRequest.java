package com.zjl.checkticket.http.requests;

import com.zjl.checkticket.http.HttpClient;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by zjl on 2016/5/7.
 */
public class CommonRequest {
    protected String url;
    protected Request request;

    protected CommonRequest() {

    }

    public Call enqueueRequest(Callback callback) {
        Call call = HttpClient.getOkHttpClient().newCall(request);
        call.enqueue(callback);

        return call;
    }

    public Response executeRequest(Callback callback) throws IOException {
        Call call = HttpClient.getOkHttpClient().newCall(request);
        Response response = call.execute();

        return response;
    }
}
