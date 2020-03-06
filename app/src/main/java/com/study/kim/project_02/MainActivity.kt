package com.study.kim.project_02

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.include_05_review.*


class MainActivity : AppCompatActivity() {

    // Shared Preferences 객체 생성
    val sharedPreferences = MySharedPreferences(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContentView(R.layout.page_01_1)

        // Shared Preferences 객체로 부터 Data 불어오기
        var like_No = sharedPreferences.getInt("likeCount")
        var dislike_No = sharedPreferences.getInt("dislikeCount")
        var like_click_Flag = 0
        var dislike_click_Flag = 0

        val image_like = findViewById(R.id.view_1_2_image2) as ImageView
        val image_dislike = findViewById(R.id.view_1_2_image3) as ImageView
        val text_like_no = findViewById(R.id.view_1_2_tv_4) as TextView
        val text_dislike_no = findViewById(R.id.view_1_2_tv_5) as TextView
        text_like_no.setText(like_No.toString())
        text_dislike_no.setText(dislike_No.toString())

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
            setlikendislike_No(like_No, dislike_No)
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
            setlikendislike_No(like_No, dislike_No)
        }

        // 한줄평
        //adapter 추가
        recyclerview_item_2.adapter = RecyclerView_Adapter()
        //레이아웃 매니저 추가
        recyclerview_item_2.layoutManager = LinearLayoutManager(this)

        // 한줄평 모두보기
        val list_ol_eval = findViewById(R.id.bt_all_view) as Button
        list_ol_eval.setOnClickListener{
            Toast.makeText(this, "한줄평 보기 Click!!", Toast.LENGTH_SHORT).show()
            val Intent = Intent(this, DisplayListActivity::class.java)
            startActivity(Intent)
        }

        // 한줄평 작성하기
        val write_ol_eval = findViewById(R.id.bt_write) as TextView
        write_ol_eval.setOnClickListener{
            Toast.makeText(this, "한줄평 쓰기 Click!!", Toast.LENGTH_SHORT).show()
        }

        // 예매하기
        val booking = findViewById(R.id.bt_book) as TextView
        booking.setOnClickListener{
            Toast.makeText(this, "예매하기 Click!!", Toast.LENGTH_SHORT).show()
        }

    } // ===================================== onCreate

    // Shared Preferences 객체에 Data 저장하기
    fun setlikendislike_No(like_No:Int, dislike_No:Int) {
        sharedPreferences.setInt("likeCount", like_No)
        sharedPreferences.setInt("dislikeCount", dislike_No)
    }

} // =======================================================



