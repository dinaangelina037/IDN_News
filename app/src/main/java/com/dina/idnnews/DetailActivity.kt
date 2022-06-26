package com.dina.idnnews

import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.dina.idnnews.databinding.ActivityDetailBinding
import com.dina.idnnews.model.DataArtikelItem
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_scrolling.view.*

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar))


        val dataNews = intent.getParcelableExtra<DataArtikelItem>("DTL")
        if (dataNews != null){

            content_news.tv_detail_news.text = dataNews.isi

            Glide.with(this)
                .load(dataNews.gambar)
                .error(R.drawable.ic_launcher_background)
                .into(img_detail_news)

//            toolbar_layout_judul.title = dataNews.judul
            binding.toolbarLayoutJudul.title = dataNews.judul
        }
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}