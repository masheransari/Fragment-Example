package com.example.xudot.fragmentexample;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private SectionsStatePageAdapter sectionsStatePageAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");

        sectionsStatePageAdapter = new SectionsStatePageAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        setUpViewPager(mViewPager);
    }

    private void setUpViewPager(ViewPager viewPager){
        SectionsStatePageAdapter adapter = new SectionsStatePageAdapter(getSupportFragmentManager());
        adapter.AddFagment(new Fragment1(),"Fragment one");
        adapter.AddFagment(new Fragment2(),"Fragment two");
        adapter.AddFagment(new Fragment3(),"Fragment three");
        viewPager.setAdapter(adapter);
    }

    public void setViewPager(int fragmentNumber){
    mViewPager.setCurrentItem(fragmentNumber);
    }

}
