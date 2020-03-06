package com.study.kim.project_02

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView

    class X_MyAdapter(private var myDataset: Array<String>) :
            RecyclerView.Adapter<X_MyAdapter.MyViewHolder>() {

        class MyViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

        override fun onCreateViewHolder(parent: ViewGroup,
                                        viewType: Int): X_MyAdapter.MyViewHolder {
            val textView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.recyclerview_item, parent, false) as TextView
            return MyViewHolder(textView)
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            holder.textView.text = myDataset[position]
        }

        override fun getItemCount() = myDataset.size
    }


/*
class RecyclerView_Adapter : RecyclerView.Adapter<RecyclerView_Adapter.MainViewHolder>() {

    var items: MutableList<RecyclerData> = mutableListOf(RecyclerData("No_01", "Content1"),
        RecyclerData("No_02", "Content2"),RecyclerData("No_03", "Content3"))

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = MainViewHolder(parent)


    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holer: MainViewHolder, position: Int) {
        items[position].let { item ->
            with(holer) {
                tvNo.text = item.no
                tvContent.text = item.content
            }
        }
    }

    inner class MainViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)) {
        val tvNo = itemView.tv_OneLineEvalNo
        val tvContent = itemView.tv_OneLineEvalContent
    }
}
*/

