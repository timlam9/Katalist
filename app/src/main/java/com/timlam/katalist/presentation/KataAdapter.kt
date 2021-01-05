package com.timlam.katalist.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.timlam.katalist.R
import com.timlam.katalist.domain.models.Kata
import kotlinx.android.synthetic.main.item_kata.view.*

class KataAdapter(
    private val katas: List<Kata>,
    private val onClick: (Kata) -> Unit
) :
    RecyclerView.Adapter<KataAdapter.KataViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KataViewHolder {
        val inflatedView = parent.inflate(R.layout.item_kata, false)
        return KataViewHolder(inflatedView, onClick)
    }

    override fun onBindViewHolder(holder: KataViewHolder, position: Int) {
        val itemKata = katas[position]
        holder.bindKata(itemKata)
    }

    override fun getItemCount(): Int = katas.size

    class KataViewHolder(
        private val view: View,
        private val onClick: (Kata) -> Unit
    ) :
        RecyclerView.ViewHolder(view) {

        private lateinit var kata: Kata

        init {
            view.setOnClickListener { onClick(kata) }
        }

        fun bindKata(kata: Kata) {
            this.kata = kata
            view.image_item_kata.setImageResource(kata.image)
            view.text_item_kata_title.text = kata.title
        }

    }

}

fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View =
    LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
