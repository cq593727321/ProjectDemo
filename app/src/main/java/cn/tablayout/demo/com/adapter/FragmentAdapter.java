package cn.tablayout.demo.com.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chawei on 2017/9/26.
 */

public class FragmentAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentsList;
    private String[] titles=new String[]{"A","B","C","e","f"};
    private Context mContext;
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    public FragmentAdapter(FragmentManager fm, List<Fragment> fragmentsList, Context context) {
        super(fm);
        this.fragmentsList = fragmentsList;
        mContext=context;
    }

    public FragmentAdapter(FragmentManager fm, String[] titles, List<Fragment> fragmentsList) {
        super(fm);
        this.fragmentsList = fragmentsList;
        this.titles = titles;
    }

    public void setFragmentsList(ArrayList<Fragment> fragmentsList) {
        this.fragmentsList = fragmentsList;
    }

    public void setFragmentsTitles(String[] titles) {
        this.titles = titles;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(titles != null && titles.length > 0) {
            return titles[position];
        }
        return null;
    }

    @Override
    public int getCount() {
        return fragmentsList == null ? 0 : fragmentsList.size();
    }

    @Override
    public Fragment getItem(int position) {
        return (fragmentsList == null || fragmentsList.size() == 0) ? null : fragmentsList.get(position);
    }

}
