package com.example.hahalolofake.gallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.hahalolofake.R
import com.example.hahalolofake.base.AbsActivity
import com.example.hahalolofake.databinding.ActivityGalleryFavoriteBinding
import com.example.hahalolofake.databinding.ActivityGalleryHomeBinding
import javax.inject.Inject

class GalleryHomeActivity @Inject constructor() : AbsActivity<ActivityGalleryHomeBinding>() {

    override fun initView() {

    }

    override fun initAction() {
        binding.favoriteBtn.setOnClickListener{
            val intent = Intent(this@GalleryHomeActivity, GalleryFavoriteAct::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun getContentView(): Int {
        return R.layout.activity_gallery_home
    }

    override fun bindViewModel() {

    }
}