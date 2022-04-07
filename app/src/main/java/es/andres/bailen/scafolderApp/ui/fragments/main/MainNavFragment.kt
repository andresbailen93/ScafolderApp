package es.andres.bailen.scafolderApp.ui.fragments.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import es.andres.bailen.scafolderApp.databinding.FragmentMainNavBinding
import es.andres.bailen.scafolderApp.ui.fragments.BaseFragment
import es.andres.bailen.scafolderApp.ui.viewModel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainNavFragment: BaseFragment() {

    private val viewModel: MainViewModel by viewModel()
    private lateinit var binding: FragmentMainNavBinding

    override fun setStaticContent() {
        //empty
    }

    override fun setListeners() {
        binding.btnSyncContacts.setOnClickListener {
            Toast.makeText(requireContext(), "On click", Toast.LENGTH_SHORT).show()
        }
    }

    override fun setObservers() {
        //empty
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainNavBinding.inflate(inflater, container, false)
        return binding.root
    }
}