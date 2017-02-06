package glossom.gzkikstarterandroid;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by zheng.gong on 2017/02/06.
 */
public class DiscoveryPagerAdapter extends FragmentPagerAdapter {
    private final Delegate delegate;
    private final FragmentManager fragmentManager;

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }

    public interface Delegate {
        void discoveryPagerAdapterSetPrimaryPage(DiscoveryPagerAdapter adapter, int position);
    }
    public DiscoveryPagerAdapter(final @NonNull FragmentManager fragmentManager, final @NonNull List<String> pageTitles, final Delegate delegate) {
        super(fragmentManager);
        this.delegate = delegate;
        this.fragmentManager = fragmentManager;
    }
}
