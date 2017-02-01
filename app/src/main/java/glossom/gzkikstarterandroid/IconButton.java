package glossom.gzkikstarterandroid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

/**
 * Created by zheng.gong on 2017/01/26.
 */

public class IconButton extends IconTextView {
    public IconButton(final @NonNull Context context) {
        super(context);
    }

    public IconButton(final @NonNull Context context, final @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public IconButton(final @NonNull Context context, final @Nullable AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
