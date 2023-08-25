package com.example.hahalolofake.gallery

import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import com.example.hahalolofake.R
import com.example.hahalolofake.base.AbsActivity
import com.example.hahalolofake.databinding.ActivityGalleryFavoriteBinding
import com.example.hahalolofake.gallery.adapter.GalleryAdapter
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

class GalleryFavoriteAct @Inject constructor() : AbsActivity<ActivityGalleryFavoriteBinding>() {

    override fun initView() {
        binding.favoriteRecycleView.layoutManager =
            GridLayoutManager(this@GalleryFavoriteAct, 3)
        binding.favoriteRecycleView.adapter = GalleryAdapter(GalleryAdapter.images)
    }


    override fun initAction() {

    }

    override fun getContentView(): Int {
        return R.layout.activity_gallery_favorite
    }

    override fun bindViewModel() {

    }
}