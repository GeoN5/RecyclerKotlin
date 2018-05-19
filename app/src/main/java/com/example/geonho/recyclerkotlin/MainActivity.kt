package com.example.geonho.recyclerkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var recyclerAdapter: RecyclerAdapter? = null
    /*이거 2개를 null로 초기화해서 setRecyclerView함수에서 nullsafe로 호출해야하는데
    * 이게 지금 null이라 실행이 안되는거같은데 그렇다고 초기화를 안하면 빨간 밑줄뜨는데...*/
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
        dataList.add(RecyclerModel(R.drawable.durian,"First : D","Dutian"))
        dataList.add(RecyclerModel(R.drawable.eggfruit,"First : E","Eggfruit"))
        dataList.add(RecyclerModel(R.drawable.fig,"First : F","Fig"))
        dataList.add(RecyclerModel(R.drawable.grape,"First : G","Graple"))
    }

    fun setRecyclerView(){
        recyclerAdapter = RecyclerAdapter(applicationContext,R.layout.item_default_recycler,dataList)
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = recyclerAdapter
    }

}
