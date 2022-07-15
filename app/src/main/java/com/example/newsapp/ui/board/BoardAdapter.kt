package com.example.newsapp.ui.board

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentBoardBinding
import com.example.newsapp.databinding.ItemBoardBinding

class BoardAdapter(val context: Context, val navController: NavController) : RecyclerView.Adapter<BoardAdapter.BoardViewHolder>() {
 private val text = arrayListOf("Text1", "Text2", "Text3")
    private val ImageView= arrayListOf(R.raw.lotti,R.raw.lotti,R.raw.lotti)
    private val list = arrayListOf("1", "2", "3")

   inner class BoardViewHolder(private var binding: ItemBoardBinding) : RecyclerView.ViewHolder(binding.root) {
       fun bind(position: Int) {
           binding.tvTitle.text = list[position]
           binding.tvText.text = text[position]
           binding.imageView.setAnimation(ImageView[position])

       }

   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardViewHolder {
        return BoardViewHolder(ItemBoardBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: BoardViewHolder, position: Int) {
       holder.bind(position)
    }

    override fun getItemCount() = 3


}