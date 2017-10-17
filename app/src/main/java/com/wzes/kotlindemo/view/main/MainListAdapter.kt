package com.wzes.kotlindemo.view.main

import com.wzes.kotlindemo.view.common.AnyItemAdapter
import com.wzes.kotlindemo.view.common.RecyclerListAdapter

/**
 * Created by xuantang on 17-10-12.
 */
class MainListAdapter(items:List<AnyItemAdapter>) : RecyclerListAdapter(items) {
    fun add(itemAdapter: AnyItemAdapter){
        items+=itemAdapter
        val index=items.indexOf(itemAdapter)
        if(index==-1) return
        notifyItemInserted(index)
    }

    fun delete(itemAdapter: AnyItemAdapter){
        val index=items.indexOf(itemAdapter)
        if(index==-1) return
        items-=itemAdapter
        notifyItemRemoved(index)
    }
}