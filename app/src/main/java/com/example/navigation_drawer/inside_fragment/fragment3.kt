package com.example.navigation_drawer.inside_fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.navigation_drawer.Questions_RecyclerVIew.DataType
import com.example.navigation_drawer.Questions_RecyclerVIew.DataTypeAdapter
import com.example.navigation_drawer.R
import kotlinx.android.synthetic.main.fragment_fragment2.*
import kotlinx.android.synthetic.main.fragment_fragment3.*

class fragment3 : Fragment() ,DataTypeAdapter.ontodoItemClickListener{

    public lateinit var  HardList:List<DataType>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter= DataTypeAdapter(HardList,this)

        rv3.adapter=adapter
        rv3.layoutManager= LinearLayoutManager(context)
    }

    override fun onItemClick(item: DataType, position: Int) {

        val url = item.link
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }


}