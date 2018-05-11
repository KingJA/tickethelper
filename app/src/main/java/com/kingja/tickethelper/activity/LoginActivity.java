package com.kingja.tickethelper.activity;

import android.view.View;
import android.widget.EditText;

import com.android.volley.Request;
import com.google.gson.Gson;
import com.kingja.supershapeview.view.SuperShapeTextView;
import com.kingja.tickethelper.base.BaseTitleActivity;
import com.kingja.tickethelper.R;
import com.kingja.tickethelper.entiy.LoginResult;
import com.kingja.tickethelper.util.CheckUtil;
import com.kingja.tickethelper.util.GoUtil;
import com.kingja.volleysir.GsonRequest;
import com.kingja.volleysir.VolleySir;
import com.orhanobut.logger.Logger;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Description:TODO
 * Create Time:2018/5/10 13:47
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class LoginActivity extends BaseTitleActivity {
    @BindView(R.id.et_login_account)
    EditText etLoginAccount;
    @BindView(R.id.stv_login_confirm)
    SuperShapeTextView stvLoginConfirm;
    @BindView(R.id.et_login_password)
    EditText etLoginPassword;

    @OnClick({ R.id.stv_login_confirm})
    public void click(View view) {
        switch (view.getId()) {
            case R.id.stv_login_confirm:
                GoUtil.goActivity(this,CheckActivity.class);
//                checkParam();
                break;
            default:
                break;
        }
    }

    private void checkParam() {
        String account = etLoginAccount.getText().toString().trim();
        String password = etLoginPassword.getText().toString().trim();

        if (CheckUtil.checkEmpty(account, "请输入手机号码") && CheckUtil.checkEmpty(password, "请输入密码")) {
            login(account,password);
        }
    }

    private void login(String account, String password) {
        showProgress(true);
        Map<String,Object> params=new HashMap<>();
        params.put("account",account);
        params.put("password",password);

//        GsonRequest request = new HigoGsonRequest.Builder<User>()
//                .setResponseType(User.class)
//                .setResponseListener(user -> {
//                    showProgress(false);
//                    Logger.d("user:" + user.getToken());
//                })
//                .setErrorListener(error -> {
//                    showProgress(false);
//                    Logger.d("error:" + error.toString());
//                })
//                .setUrl("http://traval.dev.singlook.com:8002/v1/merchantlogin")
//                .setMethod(Request.Method.POST)
//                .setParam(params)
//                .build();

        GsonRequest request = new GsonRequest.Builder<LoginResult>()
                .setResponseType(LoginResult.class)
                .setResponseListener(user -> {
                    showProgress(false);
                    Logger.json(new Gson().toJson(user));
                })
                .setErrorListener(error -> {
                    showProgress(false);
                    Logger.d("error:" + error.toString());
                })
                .setUrl("http://traval.dev.singlook.com:8002/v1/merchantlogin")
                .setMethod(Request.Method.POST)
                .setParam(params)
                .build();

        VolleySir.getDefault().addRequest(request,this);


    }

    @Override
    public void initVariable() {

    }

    @Override
    protected String getContentTitle() {
        return "登录";
    }

    @Override
    protected int getContentId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initNet() {

    }

    @Override
    protected boolean showBack() {
        return false;
    }
}
