package com.example.mcs_vasconelson_2602067514

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.mcs_vasconelson_2602067514.databinding.ActivityLoginBinding
import com.example.mcs_vasconelson_2602067514.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding
    private lateinit var emailET : EditText
    private lateinit var passwordET : EditText
    private lateinit var button : Button
    private lateinit var register : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        emailET = binding.EmailET
        passwordET = binding.passwordET
        button = binding.button
        register = binding.register

        button.setOnClickListener{
            val email = emailET.text.toString()
            val password = passwordET.text.toString()

            if(email.isEmpty() || password.isEmpty())
            {
                Toast.makeText(this, "please fill all the fields", Toast.LENGTH_SHORT).show()
            }
            else if(!email.endsWith("@puff.com"))
            {
                Toast.makeText(this, "Email must end with '@puff.com'", Toast.LENGTH_SHORT).show()
            }

            else if(password.length < 8)
            {
                Toast.makeText(this, "Password must be at least 8 characters", Toast.LENGTH_SHORT).show()
            }

            else
            {
                val intent = Intent(this , HomeActivity::class.java)
                startActivity(intent)
            }

            val toTransaction: TextView = findViewById(R.id.register)
            register.setOnClickListener {
                val registerButton = Intent(this, MainActivity::class.java)
                startActivity(
                    registerButton
                )
            }
        }




    }
}
