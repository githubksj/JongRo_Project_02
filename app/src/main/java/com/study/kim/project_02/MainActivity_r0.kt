package com.study.kim.project_02

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity_r0 : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContentView(R.layout.page_01_1)

        var like_No = 0
        var dislike_No = 0
        var like_click_Flag = 0
        var dislike_click_Flag = 0

        val image_like = findViewById(R.id.view_1_2_image2) as ImageView
        val image_dislike = findViewById(R.id.view_1_2_image3) as ImageView
        val text_like_no = findViewById(R.id.view_1_2_tv_4) as TextView
        val text_dislike_no = findViewById(R.id.view_1_2_tv_5) as TextView

        image_like.setOnClickListener {
            Toast.makeText(this, "좋아요 Click!!", Toast.LENGTH_SHORT).show()
            if(like_click_Flag == 0){
                like_click_Flag = 1
                like_No++
                Toast.makeText(this, "좋아요 수 1 증가 !", Toast.LENGTH_SHORT).show()
                image_like.setImageResource(R.drawable.ic_thumb_up_selected)
                if(dislike_click_Flag == 1){
                    dislike_No--
                    dislike_click_Flag = 0
                    image_dislike.setImageResource(R.drawable.ic_thumb_down)
                }
            } else {
                like_click_Flag = 0
                like_No--
                Toast.makeText(this, "좋아요 수 1 감소 !", Toast.LENGTH_SHORT).show()
                image_like.setImageResource(R.drawable.ic_thumb_up)
            }
            text_like_no.setText(like_No.toString())
            text_dislike_no.setText(dislike_No.toString())
        }

        image_dislike.setOnClickListener {
            Toast.makeText(this, "싫어요 Click !!", Toast.LENGTH_SHORT).show()
            if(dislike_click_Flag == 0){
                dislike_click_Flag = 1
                dislike_No++
                Toast.makeText(this, "싫어요 수 1 증가 !", Toast.LENGTH_SHORT).show()
                image_dislike.setImageResource(R.drawable.ic_thumb_down_selected)
                if(like_click_Flag == 1){
                    like_No--
                    like_click_Flag = 0
                    image_like.setImageResource(R.drawable.ic_thumb_up)
                    text_like_no.setText(like_No.toString())
                }
            } else {
                dislike_click_Flag = 0
                dislike_No--
                Toast.makeText(this, "싫어요 수 1 감소 !", Toast.LENGTH_SHORT).show()
                image_dislike.setImageResource(R.drawable.ic_thumb_down)
            }
            text_like_no.setText(like_No.toString())
            text_dislike_no.setText(dislike_No.toString())
        }

        // 한줄평 보기
        val list_ol_eval = findViewById(R.id.btn_One_line_evaluation_display) as Button
        list_ol_eval.setOnClickListener{
            Toast.makeText(this, "한줄평 보기 Click!!", Toast.LENGTH_SHORT).show()
            val Intent = Intent(this, DisplayListActivity::class.java)
            startActivity(Intent)
        }

        // 한줄평 쓰기
        val write_ol_eval = findViewById(R.id.btn_One_line_evaluation_write) as Button
        write_ol_eval.setOnClickListener{
            Toast.makeText(this, "한줄평 쓰기 Click!!", Toast.LENGTH_SHORT).show()
        }

/*
     // -------------------------- RecyclerView
        viewManager = LinearLayoutManager(this)
 //       viewAdapter = MyAdapter(myDataset)

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
    } // ===================================== onCreate
} // =======================================================

