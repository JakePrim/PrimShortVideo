package com.prim_short_video.layoutmanager;

import android.content.Context;
import android.view.View;

/**
 * ================================================
 * 作    者：linksus
 * 版    本：1.0
 * 创建日期：6/25 0025
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class ShortLayoutManager extends ViewPagerLayoutManager {
    public ShortLayoutManager(Context context) {
        super(context);
    }

    public ShortLayoutManager(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    @Override
    protected float setInterval() {
        return 10 + mDecoratedMeasurement;
    }

    @Override
    protected void setItemViewProperty(View itemView, float targetOffset) {

    }
}
