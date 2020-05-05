package com.bhardwaj.portfolioapp


import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_about_me.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val titles = mutableListOf<String>("About Me","Recent","Contact Me")

        setContentView(R.layout.activity_main)

        val adapter = TabAdapter(this, this)
        viewPager.adapter = adapter

        tabLayout.setSelectedTabIndicatorHeight(0)
        TabLayoutMediator(tabLayout,viewPager){tab, position ->
            tab.text = titles.get(position)
        }.attach()
    }
}
