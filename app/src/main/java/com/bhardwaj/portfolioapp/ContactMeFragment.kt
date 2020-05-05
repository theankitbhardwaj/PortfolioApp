package com.bhardwaj.portfolioapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_contact_me.*

/**
 * A simple [Fragment] subclass.
 */
class ContactMeFragment : Fragment(R.layout.fragment_contact_me) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_contact.layoutManager = LinearLayoutManager(activity,RecyclerView.VERTICAL,false)
        var items = ArrayList<ModelContact>()

        items.add(ModelContact(R.drawable.ic_phone,"+91 9811225651"))
        items.add(ModelContact(R.drawable.ic_mail,"iamankitbhardwaj@gmail.com"))
        items.add(ModelContact(R.drawable.ic_linkedin,"linkedin.com/in/iamankitbhardwaj"))
        items.add(ModelContact(R.drawable.ic_hackerrank,"hackerrank.com/iamankitbhardwaj"))
        items.add(ModelContact(R.drawable.ic_github,"github.com/theankitbhardwaj"))

        val adapter = ContactAdapter(items)
        rv_contact.adapter = adapter
    }

}
