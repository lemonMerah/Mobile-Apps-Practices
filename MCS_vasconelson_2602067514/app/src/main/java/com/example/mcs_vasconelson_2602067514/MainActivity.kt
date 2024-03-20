package com.example.mcs_vasconelson_2602067514

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.mcs_vasconelson_2602067514.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var userNameET : EditText
    private lateinit var emailET : EditText
    private lateinit var passwordET : EditText
    private lateinit var phoneNumberET : EditText
    private lateinit var femaleRB : RadioButton
    private lateinit var buttonSubmit : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        userNameET = binding.userNameET
        emailET = binding.EmailET
        passwordET = binding.passwordET
        phoneNumberET = binding.phoneNumberET
        femaleRB = binding.femaleRB
        buttonSubmit = binding.buttonSubmit

        femaleRB.isChecked = true

        buttonSubmit.setOnClickListener{
            val username = userNameET.text.toString()
            val email = emailET.text.toString()
            val password = passwordET.text.toString()
            val phonenumber = phoneNumberET.text.toString()

            if(email.isEmpty() || password.isEmpty() || username.isEmpty() || phonenumber.isEmpty())
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

            else if(phonenumber.length < 11 || phonenumber.length > 13)
            {
                Toast.makeText(this, "Phone Number length must be between 11 – 13 Characters", Toast.LENGTH_SHORT).show()
            }

            else{
                val builder = AlertDialog.Builder(this)

                builder.setTitle("Confirmation")
                builder.setMessage("Are you sure you want to register? ")

                builder.setPositiveButton("Yes") { dialog, which ->
                    val intent = Intent(this , LoginActivity::class.java)
                    startActivity(intent)
                }

                builder.setNegativeButton("No") {dialog, which ->
                    dialog.dismiss()
                }

                val dialog = builder.create()
                dialog.show()
            }

        }

    }
}