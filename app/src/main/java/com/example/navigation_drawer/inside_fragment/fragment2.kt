package com.example.navigation_drawer.inside_fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.navigation_drawer.ArrayMedium
import com.example.navigation_drawer.Questions_RecyclerVIew.DataType
import com.example.navigation_drawer.Questions_RecyclerVIew.DataTypeAdapter
import com.example.navigation_drawer.R
import kotlinx.android.synthetic.main.fragment_fragment1.*
import kotlinx.android.synthetic.main.fragment_fragment2.*

class fragment2 : Fragment() ,DataTypeAdapter.ontodoItemClickListener{
    // TODO: Rename and change types of parameters

    public lateinit var  mediumList:List<DataType>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment2, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)






 //       var list= ArrayMedium
        val adapter= DataTypeAdapter(mediumList,this)

        rv2.adapter=adapter
        rv2.layoutManager= LinearLayoutManager(context)

    }

    override fun onItemClick(item: DataType, position: Int) {

        val url = item.link
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }

}