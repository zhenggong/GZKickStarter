package glossom.gzkikstarterandroid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;

/**
 * Created by zheng.gong on 2017/01/19.
 */

public class DiscoveryToolbar extends Toolbar{


    public DiscoveryToolbar(final @NonNull Context context) {
        super(context);
    }

    public DiscoveryToolbar(final @NonNull Context context, final @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DiscoveryToolbar(final @NonNull Context context, final @Nullable AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
