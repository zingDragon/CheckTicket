package com.zjl.checkticket.http.callbacks;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * TODO: remove, 这个类设计的使用起来反而不方便
 * Created by zjl on 2016/5/7.
 */

@Deprecated
public abstract class CommonCallback implements Callback {
    @Override
    public void onFailure(Call call, IOException e) {
        e.printStackTrace();
    }

    @Override
    public void onResponse(Call call, Response response) throws IOException {
        if (!response.isSuccessful()) {
            throw new IOException("Unexpected code " + response);
        }

        handleSuccess(call, response);
    }

    public abstract void handleSuccess(Call call, Response response) throws IOException;
}
