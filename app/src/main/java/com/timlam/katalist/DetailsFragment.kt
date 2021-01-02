package com.timlam.katalist

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_details.view.*

class DetailsFragment : Fragment(R.layout.fragment_details) {

    companion object {

        private const val KATA_MODEL = "kata_model"

        fun newInstance(kata: Kata): DetailsFragment {
            val args = Bundle()
            args.putSerializable(KATA_MODEL, kata)

            val fragment = DetailsFragment()
            fragment.arguments = args

            return fragment
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val kata = requireArguments().getSerializable(KATA_MODEL) as Kata

        view.image_details.setImageResource(kata.image)
        view.text_details_title.text = kata.title
        view.text_details_info.text = kata.info
    }


}
