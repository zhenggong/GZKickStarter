package glossom.gzkikstarterandroid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.util.AttributeSet;

/**
 * Created by zheng.gong on 2017/02/02.
 */

public final class SortTabLayout extends TabLayout {

    public SortTabLayout(final @NonNull Context context) {
        super(context);
    }

    public SortTabLayout(final @NonNull Context context, final @NonNull AttributeSet attrs) {
        super(context, attrs);
    }

    public SortTabLayout(final @NonNull Context context, final @NonNull AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
