package com.kingja.tickethelper.activity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.kingja.tickethelper.R;
import com.kingja.tickethelper.base.BaseTitleActivity;
import com.kingja.tickethelper.util.GoUtil;
import com.kingja.tickethelper.util.ToastUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Description:TODO
 * Create Time:2018/5/11 14:21
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class CheckActivity extends BaseTitleActivity {
    @BindView(R.id.et_code)
    EditText etCode;
    @BindView(R.id.iv_clear)
    ImageView ivClear;

    @OnClick({R.id.stv_num_one, R.id.stv_num_two, R.id.stv_num_three, R.id.stv_num_four, R.id.stv_num_five,
            R.id.stv_num_six, R.id.stv_num_seven, R.id.stv_num_eight, R.id.stv_num_nine, R.id.stv_num_zero,
            R.id.stv_num_check, R.id.stv_num_clear, R.id.iv_clear,})
    public void click(View view) {
        switch (view.getId()) {
            case R.id.stv_num_one:
                appenNum(1);
                break;
            case R.id.stv_num_two:
                appenNum(2);
                break;
            case R.id.stv_num_three:
                appenNum(3);
                break;
            case R.id.stv_num_four:
                appenNum(4);
                break;
            case R.id.stv_num_five:
                appenNum(5);
                break;
            case R.id.stv_num_six:
                appenNum(6);
                break;
            case R.id.stv_num_seven:
                appenNum(7);
                break;
            case R.id.stv_num_eight:
                appenNum(8);
                break;
            case R.id.stv_num_nine:
                appenNum(9);
                break;
            case R.id.stv_num_zero:
                appenNum(0);
                break;
            case R.id.stv_num_clear:
                String num = etCode.getText().toString().trim();
                if (num.length() > 0) {
                    String newNum = num.substring(0, num.length()-1);
                    etCode.setText(newNum);
                    etCode.setSelection(etCode.getText().length());
                }
                break;
            case R.id.stv_num_check:
                GoUtil.goActivity(this,TicketDetailActivity.class);
                break;
            case R.id.iv_clear:
                etCode.setText("");
                break;

            default:
                break;
        }
    }

    private void appenNum(int num) {
        String newNum = etCode.getText().toString() + num;
        etCode.setText(newNum);
        etCode.setSelection(etCode.getText().length());
    }

    @Override
    public void initVariable() {

    }

    @Override
    protected String getContentTitle() {
        return "入园验证";
    }

    @Override
    protected int getContentId() {
        return R.layout.activity_check;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        setMenuRes(R.mipmap.ic_scan, v -> {
            ToastUtil.showText("扫码");

        });

        etCode.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                ivClear.setVisibility(s.length() > 0 ? View.VISIBLE : View.GONE);

            }
        });

    }

    @Override
    protected void initNet() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
