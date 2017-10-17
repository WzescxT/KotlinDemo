package com.wzes.kotlindemo.view.main

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.wzes.kotlindemo.R
import com.wzes.kotlindemo.model.MarvelCharacter
import com.wzes.kotlindemo.view.common.ItemAdapter
import com.wzes.kotlindemo.view.common.bindView
import com.wzes.kotlindemo.view.common.loadImage

/**
 * Created by xuantang on 17-10-12.
 */
class CharacterItemAdapter(val character: MarvelCharacter) :
    ItemAdapter<CharacterItemAdapter.ViewHolder>(R.layout.item_character){
    override val layoutId: Int
        get() = super.layoutId

    override fun onCreateViewHolder(itemView: View) = ViewHolder(itemView)

    override fun ViewHolder.onBindViewHolder() {
        textView.text = character.name
        imageView.loadImage(character.imageUrl)
    }

    class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        val textView by bindView<TextView>(R.id.textView)
        val imageView by bindView<ImageView>(R.id.imageView)
    }
}