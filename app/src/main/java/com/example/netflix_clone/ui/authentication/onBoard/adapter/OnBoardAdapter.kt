package com.example.netflix_clone.ui.authentication.onBoard.adapter

import android.view.ViewGroup
import com.example.base.BaseAdapter
import com.example.base.BaseHolder
import com.example.base.BaseViewHolder
import com.example.base.utils.inflate
import com.example.netflix_clone.R
import com.example.netflix_clone.databinding.ItemOnboardImgTxtBinding
import com.example.netflix_clone.ui.authentication.onBoard.model.OnBoardItem

class OnBoardAdapter(items: List<OnBoardItem>) : BaseAdapter<OnBoardItem>() {
    init {

//        val items =
        submitList(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHolder<OnBoardItem> {
        return OnBoardHolder(parent.inflate(R.layout.item_onboard_img_txt))
    }

    private inner class OnBoardHolder(binding: ItemOnboardImgTxtBinding) :
        BaseViewHolder<ItemOnboardImgTxtBinding, OnBoardItem>(binding) {
        override fun onBind(item: OnBoardItem) {
            binding.item = item
            binding.onBoardImg.setImageResource(item.imageResId)
        }
    }
}