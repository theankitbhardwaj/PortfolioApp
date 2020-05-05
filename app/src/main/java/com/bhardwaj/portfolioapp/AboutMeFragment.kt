package com.bhardwaj.portfolioapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_about_me.*

/**
 * A simple [Fragment] subclass.
 */
class AboutMeFragment : Fragment(R.layout.fragment_about_me) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_aboutme.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL,false)
        val aboutme = ArrayList<Model>()
        aboutme.add(Model("CAREER OBJECTIVE","Looking forward to gain an Entry Level job in a company which challenges my existing qualities and give me opportunities to learn more."))
        aboutme.add(Model("PERSONAL SKILLS","&bull Team Player <br>&bull Attentive & Versatile <br>&bull Quick Learner <br>&bull Computer Enthusiastic <br>&bull Dedicated"))
        aboutme.add(Model("EDUCATION","<b>&bull SRM University,Sonipat • Present</b><br>&ensp; Pursuing B.Tech. (C.S.E.) with IBM\n" +
                "&ensp; Specialisation in Big Data Analytics<br><br><b>&bull Indus Public School • 2017</b><br>&ensp; Senior Secondary Education<br><br>" +
                "<b>&bull Akash Sr. Sec. School • 2015</b><br>&ensp; Secondary Education"))
        aboutme.add(Model("EXPERIENCE","<b>&bull Fresher</b><br>&ensp; Not having any industrial<br>" +
                "&ensp; experience yet but having<br>" +
                "&ensp; enough technical experience to<br>" +
                "&ensp; handle a S/W job."))

        val rvAdapter = Adapter(aboutme)
        rv_aboutme.adapter = rvAdapter
    }


}
