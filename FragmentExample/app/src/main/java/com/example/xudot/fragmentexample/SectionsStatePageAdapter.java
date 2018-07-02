package com.example.xudot.fragmentexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;

import java.util.ArrayList;
import java.util.List;

public class SectionsStatePageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitle = new ArrayList<>();

    public SectionsStatePageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void AddFagment(Fragment fragment,String fragmentTitle){
        mFragmentList.add(fragment);
        mFragmentTitle .add(fragmentTitle);
    }
}
