package com.timlam.katalist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_details.view.*
import kotlinx.android.synthetic.main.item_kata.view.*

class KataAdapter(
    private val katas: List<Kata>,
    private val kataItemClickListener: KataItemClickListener
) :
    RecyclerView.Adapter<KataAdapter.KataViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KataViewHolder {
        val inflatedView = parent.inflate(R.layout.item_kata, false)
        return KataViewHolder(inflatedView, kataItemClickListener)
    }

    override fun onBindViewHolder(holder: KataViewHolder, position: Int) {
        val itemKata = katas[position]
        holder.bindKata(itemKata)
    }

    override fun getItemCount(): Int = katas.size

    class KataViewHolder(
        private val view: View,
        private val kataItemClickListener: KataItemClickListener
    ) :
        RecyclerView.ViewHolder(view) {

        private lateinit var kata: Kata

        fun bindKata(kata: Kata) {
            this.kata = kata
            view.image_item_kata.setImageResource(kata.image)
            view.text_item_kata_title.text = kata.title
            view.setOnClickListener { kataItemClickListener.onKataClicked(kata) }
        }

    }

}

interface KataItemClickListener {

    fun onKataClicked(kata: Kata)

}

fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View =
    LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
