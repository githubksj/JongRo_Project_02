package com.study.kim.project_02

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import kotlinx.android.synthetic.main.recyclerview_item.view.*

class RecyclerView_Adapter : RecyclerView.Adapter<RecyclerView_Adapter.RecyclerViewHolder>() {

    //items MutableList, MutableList는 item을 추가할 수 있다.
    var items: MutableList<RecyclerViewData> = mutableListOf(
        RecyclerViewData("한줄평1", "좋아요.....1"),
        RecyclerViewData("한줄평2", "좋아요.....2"),
        RecyclerViewData("한줄평3", "좋아요.....3"),
        RecyclerViewData("한줄평4", "좋아요.....4"),
        RecyclerViewData("한줄평5", "좋아요.....5"),
        RecyclerViewData("한줄평6", "좋아요.....6"),
        RecyclerViewData("한줄평7", "좋아요.....7"),
        RecyclerViewData("한줄평8", "좋아요.....8"),
        RecyclerViewData("한줄평1", "...싫어요.....1"),
        RecyclerViewData("한줄평2", "...싫어요.....2"),
        RecyclerViewData("한줄평3", "...싫어요.....3"),
        RecyclerViewData("한줄평4", "...싫어요.....4")
    )

    //뷰홀더 생성
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int) = RecyclerViewHolder(p0)

    //item 사이즈
    override fun getItemCount(): Int = items.size

    //여기서 item을 textview에 옮겨준다.
    override fun onBindViewHolder(p0: RecyclerViewHolder, p1: Int) {
        items[p1].let { item ->
            with(p0) {
                OneLineEval_No.text = item.oneLineEval_No
                OneLineEval_content.text = item.oneLineEval_content
            }
        }
    }

    inner class RecyclerViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)
    ) {
        val OneLineEval_No = itemView.tv_OneLineEval_No
        val OneLineEval_content = itemView.tv_OneLineEval_Content
    }
}

/*
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView_Adapter.RecyclerViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        RecyclerViewHolder(p0)
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    override fun onBindViewHolder(p0: RecyclerView_Adapter.RecyclerViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
*/


