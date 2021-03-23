package com.example.navigation_drawer.inside_fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.navigation_drawer.R
import com.example.navigation_drawer.Questions_RecyclerVIew.DataType
import com.example.navigation_drawer.Questions_RecyclerVIew.DataTypeAdapter
import com.example.navigation_drawer.TodoList
import kotlinx.android.synthetic.main.fragment_fragment1.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class fragment1 : Fragment(),DataTypeAdapter.ontodoItemClickListener {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment1, container, false)
    }



    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)


        var todoList= mutableListOf(
            DataType("arrays","https://www.geeksforgeeks.org/"),
            DataType("c++","https://www.geeksforgeeks.org/"),
            DataType("Check if a key is present in every segment of size k in an array","https://www.geeksforgeeks.org/check-if-a-key-is-present-in-every-segment-of-size-k-in-an-array/")

        )

        var list=TodoList
        val adapter= DataTypeAdapter(list,this)

        rv.adapter=adapter
        rv.layoutManager= LinearLayoutManager(context)
//        recycler_view.apply {
//            // set a LinearLayoutManager to handle Android
//            // RecyclerView behavior
//            layoutManager = LinearLayoutManager(activity)
//            // set the custom adapter to the RecyclerView
//            adapter = RecyclerAdapter()
//        }
    }

    override fun onItemClick(item: DataType, position: Int) {


        val url = item.link
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)


    }


}