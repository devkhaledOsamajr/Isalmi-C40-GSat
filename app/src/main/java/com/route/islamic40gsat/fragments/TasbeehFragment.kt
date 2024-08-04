package com.route.islamic40gsat.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.route.islamic40gsat.R

class TasbeehFragment : Fragment() {

    private var counter = 0
    private var maxCounter = 30

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tasbeeh, container, false)
        val subhanAllahTv: TextView = view.findViewById(R.id.tasbeh_click)
        val tasbeehCounter: TextView = view.findViewById(R.id.tasbeh_counter)
        subhanAllahTv.setOnClickListener{incrementCounter(tasbeehCounter)}


        return view
    }

    private fun incrementCounter(tasbeehCounter: TextView) {
        counter++
        if (counter > maxCounter) {
            counter = 0
        }
        tasbeehCounter.text = counter.toString()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}