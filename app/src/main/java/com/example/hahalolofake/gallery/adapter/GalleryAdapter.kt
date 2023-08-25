package com.example.hahalolofake.gallery.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hahalolofake.R
import com.example.hahalolofake.databinding.ItemFavoriteBinding

class GalleryAdapter(val galleryList: ArrayList<Int>):
    RecyclerView.Adapter<GalleryAdapter.GallaryViewHolder>() {

    companion object{
        val images = arrayListOf(
            R.drawable.favorite_img_1,
            R.drawable.favorite_img_2,
            R.drawable.favorite_vid,
            R.drawable.favorite_img_3,
            R.drawable.favorite_img_4,
            R.drawable.favorite_img_5,
            R.drawable.favorite_img_6,
            R.drawable.favorite_img_7,
            R.drawable.favorite_img_8,
            R.drawable.favorite_img_9,
            R.drawable.favorite_img_10,
            R.drawable.favorite_img_11,
            R.drawable.favorite_img_12,
            R.drawable.favorite_img_1,
            R.drawable.favorite_img_2,
            R.drawable.favorite_vid,
            R.drawable.favorite_img_3,
            R.drawable.favorite_img_4,
            R.drawable.favorite_img_5,
            R.drawable.favorite_img_6,
            R.drawable.favorite_img_7,
            R.drawable.favorite_img_8,
            R.drawable.favorite_img_9,
            R.drawable.favorite_img_10,
            R.drawable.favorite_img_11,
            R.drawable.favorite_img_12,
        )
    }

    inner class GallaryViewHolder(val binding: ItemFavoriteBinding):
        RecyclerView.ViewHolder(binding.root){
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GallaryViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemFavoriteBinding.inflate(layoutInflater, parent, false)
        return GallaryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GallaryViewHolder, position: Int) {
        val itemImage = galleryList[position]
        holder.binding.favoriteImg.setImageResource(itemImage)
    }

    override fun getItemCount(): Int {
        return galleryList.size
    }
}