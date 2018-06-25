package com.prim_short_video.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.prim_short_video.R;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * ================================================
 * 作    者：linksus
 * 版    本：1.0
 * 创建日期：6/25 0025
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class ShortAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private WeakReference<Context> mContext;

    private List<String> list;

    public ShortAdapter(Context context, List<String> list) {
        this.mContext = new WeakReference<Context>(context);
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(mContext.get()).inflate(R.layout.item_short_layout, viewGroup, false);
        return new ShortHolder(inflate);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ShortHolder shortHolder = (ShortHolder) viewHolder;
        shortHolder.update(i);
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    private class ShortHolder extends RecyclerView.ViewHolder {

        private TextView text;

        public ShortHolder(View itemView) {
            super(itemView);
            text = (TextView) itemView.findViewById(R.id.text);
        }

        public void update(int position) {
            if (list == null) return;
            if (list.size() > 0) {
                text.setText(list.get(position));
            }
        }
    }
}
