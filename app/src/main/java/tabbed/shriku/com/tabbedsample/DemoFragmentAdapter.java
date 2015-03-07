package tabbed.shriku.com.tabbedsample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by shrikanth on 7/3/15.
 */
public class DemoFragmentAdapter  extends FragmentStatePagerAdapter {

    public DemoFragmentAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int i) {
        Fragment fragment = DemoFragment.newInstance("Page",i+"");
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}
