package es.andres.bailen.scafolderApp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.andres.bailen.scafolderApp.R
import es.andres.bailen.scafolderApp.databinding.ActivityMainBinding
import es.andres.bailen.scafolderApp.ui.viewModel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}