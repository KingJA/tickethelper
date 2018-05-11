package com.kingja.tickethelper.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kingja.tickethelper.R;

import java.util.List;

/**
 * Description:TODO
 * Create Time:2018/5/11 15:31
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class TicketDetailAdapter extends BaseLvAdapter<Object> {
    public TicketDetailAdapter(Context context, List<Object> list) {
        super(context, list);
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public View simpleGetView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.item_ticket, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }

    public class ViewHolder {
        public TextView tv_firstLetter;
        public TextView tv_name;
        public TextView tv_number;
        public View root;

        public ViewHolder(View root) {
            this.root = root;
            tv_firstLetter = root.findViewById(R.id.tv_ticket_name);
        }
    }
}
