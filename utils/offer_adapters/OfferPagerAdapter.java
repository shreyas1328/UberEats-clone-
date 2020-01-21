package com.shreyas.uber_eats_clone.utils.offer_adapters;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.shreyas.uber_eats_clone.offer_fragments.OfferRvFragment;
import com.shreyas.uber_eats_clone.modelClass.RTL_model;

import java.util.ArrayList;

public class OfferPagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<RTL_model> mList;
    private int position;
    private static final String TAG = "OfferPagerAdapter1";

    public OfferPagerAdapter(@NonNull FragmentManager fm, int behavior, ArrayList<RTL_model> mList) {
        super(fm, behavior);
        this.mList = mList;


    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        OfferRvFragment fragment = new OfferRvFragment(mList.get(position).getOfferItems());
        Log.d(TAG, "getItem: "+position);
        return fragment;
    }

    @Override
    public int getCount() {
        return mList.size();
    }


    //get tab_item
    public RTL_model get_item(int position) {
//        Log.d(TAG, "get_item: "+position);
        return mList.get(position);
    }


}
