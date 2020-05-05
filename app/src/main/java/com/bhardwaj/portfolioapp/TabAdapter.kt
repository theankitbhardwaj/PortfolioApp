package com.bhardwaj.portfolioapp

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bhardwaj.portfolioapp.AboutMeFragment
import com.bhardwaj.portfolioapp.ContactMeFragment

class TabAdapter(fm:FragmentActivity,context: Context): FragmentStateAdapter(fm) {
    private var context:Context;
    init {
        this.context = context
    }
    override fun getItemCount(): Int{
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> return AboutMeFragment()
            1 -> return RecentFragment()
            2 -> return ContactMeFragment()
        }
        return AboutMeFragment()
    }
}

