package com.timlam.katalist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.timlam.katalist.KatasRepository.katas
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), KataItemClickListener {

    private lateinit var kataAdapter: KataAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kataAdapter = KataAdapter(katas, this)

        list_kata.apply {
            adapter = kataAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

    }

    override fun onKataClicked(kata: Kata) {
        val detailsFragment = DetailsFragment.newInstance(kata)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.details_fragment, detailsFragment, "dogDetails")
            .addToBackStack(null)
            .commit()

    }

}
