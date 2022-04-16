package io.github.tuguzt.fragments

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import io.github.tuguzt.fragments.databinding.ItemColorBinding

class ColorViewHolder(
    private val binding: ItemColorBinding,
    private val onItemClicked: (position: Int) -> Unit
) : ViewHolder(binding.root), View.OnClickListener {

    init { binding.root.setOnClickListener(this) }

    fun bind(color: Pair<String, Int>): Unit = binding.run {
        itemText.text = color.first
        itemLayout.setBackgroundColor(color.second)
    }

    override fun onClick(v: View?) {
        onItemClicked(absoluteAdapterPosition)
    }
}
