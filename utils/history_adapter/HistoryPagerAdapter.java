package com.shreyas.uber_eats_clone.utils.history_adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.shreyas.uber_eats_clone.history_fragment.HistoryRvFragment;
import com.shreyas.uber_eats_clone.modelClass.RTL_model;

import java.util.ArrayList;

public class HistoryPagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<RTL_model> mList;

    public HistoryPagerAdapter(@NonNull FragmentManager fm, int behavior, ArrayList<RTL_model> mList) {
        super(fm, behavior);
        this.mList = mList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        HistoryRvFragment fragment = new HistoryRvFragment(mList.get(position).getHistoryItems());
        return fragment;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    public RTL_model getTabTitle(int position) {
        return mList.get(position);
    }
}
