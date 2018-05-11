package com.kingja.tickethelper.entiy;

import com.google.gson.Gson;
import com.kingja.tickethelper.util.ToastUtil;
import com.kingja.volleysir.GsonRequest;
import com.orhanobut.logger.Logger;

/**
 * Description:TODO
 * Create Time:2018/5/11 13:29
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class HigoGsonRequest<T> extends GsonRequest<HttpResult<T>> {
    public HigoGsonRequest(Builder builder) {
        super(builder);
    }

    @Override
    protected void deliverResponse(HttpResult<T> response) {
        Logger.d("deliverResponse");
        Logger.json(new Gson().toJson(HttpResult.class));
        if (response.getCode() == 200) {
            super.deliverResponse(response);
        } else {
            ToastUtil.showText(response.getMessage());
        }
    }
}
