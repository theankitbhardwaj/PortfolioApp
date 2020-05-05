package com.bhardwaj.portfolioapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_recent.*

/**
 * A simple [Fragment] subclass.
 */
class RecentFragment : Fragment(R.layout.fragment_recent) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_recent.layoutManager = LinearLayoutManager(activity,RecyclerView.VERTICAL,false)
        var items = ArrayList<Model>()
        items.add(Model("RECENT ACTIVITIES","&bull Created my own Portfolio App<br>(this one)<br><br>" +
                "&bull Working on a mock food delivery android app development.<br><br>" +
                "&bull Participated in Debate held in University.<br><br>" +
                "&bull Won 2nd prize in Coding Event held in University.<br><br>" +
                "&bull Attended Python Machine Learning Basics Workshop.<br><br>" +
                "&bull Completed Udemy's Oracle Certification: Mastering Java for Beginners & Experts."))
        val adapter = Adapter(items)
        rv_recent.adapter = adapter
    }
}
