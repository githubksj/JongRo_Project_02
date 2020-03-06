package com.study.kim.project_02

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import kotlinx.android.synthetic.main.list_ol_eval.*

class DisplayListActivity : AppCompatActivity() {

//    private lateinit var recyclerView: RecyclerView
//    private lateinit var viewAdapter: RecyclerView.Adapter<*>
//    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_ol_eval)

        Toast.makeText(this, "한줄평 보기 화면 !!", Toast.LENGTH_SHORT).show()

        //adapter 추가
        recyclerview_item_1.adapter = RecyclerView_Adapter()
        //레이아웃 매니저 추가
        recyclerview_item_1.layoutManager = LinearLayoutManager(this)

    }
}
/*
        // -------------------------- RecyclerView
        viewManager = LinearLayoutManager(this)
//        viewAdapter = MyAdapter(myDataset)  //=============== error =====

        recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
*/


/*
        // ---------------------
        viewManager = LinearLayoutManager(this)
        viewAdapter = MyAdapter(myDataset)

        recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view).apply {
            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            setHasFixedSize(true)

            // use a linear layout manager
            layoutManager = viewManager

            // specify an viewAdapter (see also next example)
            adapter = viewAdapter
        }
*/
