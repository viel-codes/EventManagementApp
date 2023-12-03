package com.labactivity.eventmanagement;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.labactivity.eventmanagement.fragments.Package1Fragment;
import com.labactivity.eventmanagement.fragments.Package2Fragment;
import com.labactivity.eventmanagement.fragments.Package3Fragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Package1Fragment();
            case 1:
                return new Package2Fragment();
            case 2:
                return new Package3Fragment();
            default:
                return new Package1Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
