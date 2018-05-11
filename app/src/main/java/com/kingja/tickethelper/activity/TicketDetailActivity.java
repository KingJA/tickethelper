package com.kingja.tickethelper.activity;

import android.os.Bundle;
import android.widget.ListView;

import com.kingja.tickethelper.R;
import com.kingja.tickethelper.adapter.TicketDetailAdapter;
import com.kingja.tickethelper.base.BaseTitleActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Description:TODO
 * Create Time:2018/5/11 15:44
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class TicketDetailActivity extends BaseTitleActivity {
    @BindView(R.id.lv_ticket_detail)
    ListView lvTicketDetail;
    private TicketDetailAdapter ticketDetailAdapter;

    @Override
    public void initVariable() {

    }

    @Override
    protected String getContentTitle() {
        return "详情";
    }

    @Override
    protected int getContentId() {
        return R.layout.activity_ticket_detail;
    }

    @Override
    protected void initView() {
        ticketDetailAdapter = new TicketDetailAdapter(this, null);

    }

    @Override
    protected void initData() {
        lvTicketDetail.setAdapter(ticketDetailAdapter);

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
