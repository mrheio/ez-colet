package proj.ezcolet

import android.graphics.PixelFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import proj.ezcolet.databinding.ActivityMainBinding
import proj.ezcolet.services.ViewService

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        window.setFormat(PixelFormat.RGBA_8888)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        binding.registerBtn.setOnClickListener() {
            ViewService.setView(this, RegisterActivity())
        }

        setContentView(binding.root)
    }
}