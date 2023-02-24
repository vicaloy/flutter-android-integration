package com.valoy.notmainlib.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.Observer
import com.valoy.notmainlib.LibModule
import com.valoy.notmainlib.R

class LibFragment : Fragment() {

    companion object {
        fun newInstance() = LibFragment()
    }

    private lateinit var viewModel: LibViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LibViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button).setOnClickListener{
            viewModel.onButtonClick()
        }

        viewModel.showFlutterQuestionView.observe(viewLifecycleOwner, Observer {
            goToFlutterQuestionActivity()
        })
    }

    private fun goToFlutterQuestionActivity() {
        LibModule.flutterIntegrationService?.getQuestionViewIntent(requireContext())?.apply {
            startActivity(this)
        }
    }

}