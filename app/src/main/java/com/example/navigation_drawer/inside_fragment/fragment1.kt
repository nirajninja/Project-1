package com.example.navigation_drawer.inside_fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.navigation_drawer.R
import com.example.navigation_drawer.Questions_RecyclerVIew.DataType
import com.example.navigation_drawer.Questions_RecyclerVIew.DataTypeAdapter
import com.example.navigation_drawer.webview.browser

import kotlinx.android.synthetic.main.fragment_fragment1.*


class fragment1 : Fragment(), DataTypeAdapter.ontodoItemClickListener {
    public lateinit var list2: List<DataType>

    override fun onCreateView(


        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment1, container, false)
    }


    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        val adapter = DataTypeAdapter(list2, this)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(context)
    }

    override fun onItemClick(item: DataType, position: Int) {
        val url = item.link
        val intent = Intent(
            this.context,
            browser::class.java
        )
        intent.putExtra("extra", url)
        startActivity(intent)
    }



}