package com.example.simulacro.activities

import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.os.Handler
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.simulacro.R
import com.example.simulacro.adapters.MascotaListAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            //val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:911"))

            //Logica Carga Forzada

            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}