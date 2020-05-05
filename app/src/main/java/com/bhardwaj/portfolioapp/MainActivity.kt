package com.bhardwaj.portfolioapp


import TabAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val titles = mutableListOf<String>("About Me","Contact Me")
        setContentView(R.layout.activity_main)
        val adapter = TabAdapter(this,this)
        viewPager.adapter = adapter
        tabLayout.setSelectedTabIndicatorHeight(0)
        TabLayoutMediator(tabLayout,viewPager){tab, position ->
            tab.text = titles.get(position)
        }.attach()

    }
}
