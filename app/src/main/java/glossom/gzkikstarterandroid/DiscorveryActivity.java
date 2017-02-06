package glossom.gzkikstarterandroid;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

import butterknife.BindString;
import butterknife.ButterKnife;

public class DiscorveryActivity extends BaseActivity<DiscoveryViewModel> implements ActivityLifecycleType {
    private DiscoveryPagerAdapter pagerAdapter;
    protected @BindString(R.string.A_newer_build_is_available) String aNewerBuildIsAvailableString;
    protected @BindString(R.string.Home) String homeString;
    protected @BindString(R.string.Upgrade_app) String upgradeAppString;
    protected @BindString(R.string.Popular) String popularString;
    protected @BindString(R.string.discovery_sort_types_newest) String newestString;
    protected @BindString(R.string.Ending_soon) String endingSoonString;
    protected @BindString(R.string.discovery_sort_types_most_funded) String mostFundedString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discorvery);
        ButterKnife.bind(this);
        final List<String> viewPagerTitles = Arrays.asList(homeString, popularString, newestString, endingSoonString,
                mostFundedString);
        pagerAdapter = new DiscoveryPagerAdapter(getSupportFragmentManager(), viewPagerTitles, viewModel.inputs);
    }
}
