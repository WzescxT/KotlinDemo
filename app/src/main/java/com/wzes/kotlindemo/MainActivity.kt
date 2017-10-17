package com.wzes.kotlindemo


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.view.Window
import com.wzes.kotlindemo.model.MarvelCharacter
import com.wzes.kotlindemo.view.main.CharacterItemAdapter
import com.wzes.kotlindemo.view.main.MainListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var characters = listOf(
            MarvelCharacter(name = "3-D Man",
                    imageUrl = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1507804097255&di=5bb4e31060c01b58e139fe8d264d7a48&imgtype=0&src=http%3A%2F%2Fimg31.mtime.cn%2FCMS%2FGallery%2F2015%2F10%2F27%2F145845.10333206_575X590X3.jpg"),
            MarvelCharacter(name = "Abomination (Emil Blonsky",
                    imageUrl = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1507804097255&di=5bb4e31060c01b58e139fe8d264d7a48&imgtype=0&src=http%3A%2F%2Fimg31.mtime.cn%2FCMS%2FGallery%2F2015%2F10%2F27%2F145845.10333206_575X590X3.jpg"),
            MarvelCharacter(name = "3-D Man",
                    imageUrl = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1507804097255&di=5bb4e31060c01b58e139fe8d264d7a48&imgtype=0&src=http%3A%2F%2Fimg31.mtime.cn%2FCMS%2FGallery%2F2015%2F10%2F27%2F145845.10333206_575X590X3.jpg"),
            MarvelCharacter(name = "Abomination (Emil Blonsky",
                    imageUrl = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1507804097255&di=5bb4e31060c01b58e139fe8d264d7a48&imgtype=0&src=http%3A%2F%2Fimg31.mtime.cn%2FCMS%2FGallery%2F2015%2F10%2F27%2F145845.10333206_575X590X3.jpg"),
            MarvelCharacter(name = "3-D Man",
                    imageUrl = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1507804097255&di=5bb4e31060c01b58e139fe8d264d7a48&imgtype=0&src=http%3A%2F%2Fimg31.mtime.cn%2FCMS%2FGallery%2F2015%2F10%2F27%2F145845.10333206_575X590X3.jpg"),
            MarvelCharacter(name = "Abomination (Emil Blonsky",
                    imageUrl = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1507804097255&di=5bb4e31060c01b58e139fe8d264d7a48&imgtype=0&src=http%3A%2F%2Fimg31.mtime.cn%2FCMS%2FGallery%2F2015%2F10%2F27%2F145845.10333206_575X590X3.jpg")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)
        

        characters += characters

        recyclerView.layoutManager=GridLayoutManager(this, 2)
        val categoryItemAdapters = characters.map(::CharacterItemAdapter)
        recyclerView.adapter = MainListAdapter(categoryItemAdapters)
    }
}
