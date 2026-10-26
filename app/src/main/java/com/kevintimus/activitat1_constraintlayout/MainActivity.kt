package com.kevintimus.activitat1_constraintlayout

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.kevintimus.activitat1_constraintlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //1. Enllaçar els elements del XML utiltzant findViewById
        val miBoton: Button = binding.signUpButton
        val email: EditText = binding.editTextTextEmailAddress
        val password: EditText = binding.editTextTextPassword
        val contrasenyaCorrecta = "patata1234"
        val emailCorrecto = "raul@gmail.com"

        //2. Afegir l'event onClick al boto
        miBoton.setOnClickListener {
            //3. Comprovar les credencials
            if (email.text.toString() == emailCorrecto && password.text.toString() == contrasenyaCorrecta) {
                Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Ko", Toast.LENGTH_SHORT).show()
            }
        }


//        //1. Enllaçar els elements del XML utiltzant findViewById
//        val miBoton: Button = findViewById(R.id.SignUpButton)
//        val email: EditText = findViewById(R.id.editTextTextEmailAddress)
//        val password: EditText = findViewById(R.id.editTextTextPassword)
//        val contrasenyaCorrecta = "patata1234"
//        val emailCorrecto = "raul@gmail.com"
//
//        //2. Afegir l'event onClick al boto
//        miBoton.setOnClickListener {
//            //3. Comprovar les credencials
//            if (email.text.toString() == emailCorrecto && password.text.toString() == contrasenyaCorrecta) {
//                Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show()
//            } else {
//                Toast.makeText(this, "Ko", Toast.LENGTH_SHORT).show()
//            }
//        }
    }
}