package com.example.geonho.recyclerkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var recyclerAdapter: RecyclerAdapter? = null
    val dataList = arrayListOf<RecyclerModel>()  //기존 List는 immutable.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addDummy()
        setRecyclerView()
    }

    fun addDummy(){
        dataList.add(RecyclerModel(R.drawable.apple,"First : A","Apple"))
        dataList.add(RecyclerModel(R.drawable.banana,"First : B","Banana"))
        dataList.add(RecyclerModel(R.drawable.cherry,"First : C","Cherry"))
        dataList.add(RecyclerModel(R.drawable.durian,"First : D","Durian"))
        dataList.add(RecyclerModel(R.drawable.eggfruit,"First : E","Eggfruit"))
        dataList.add(RecyclerModel(R.drawable.fig,"First : F","Fig"))
        dataList.add(RecyclerModel(R.drawable.grape,"First : G","Grape"))
    }

    fun setRecyclerView(){
        recyclerAdapter = RecyclerAdapter(applicationContext,R.layout.item_default_recycler,dataList)
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = recyclerAdapter
    }
}
