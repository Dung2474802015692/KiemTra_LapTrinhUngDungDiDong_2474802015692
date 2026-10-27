package com.example.kiemtra_laptrinhungdungdidong_2474802015692

import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvStatus = findViewById<TextView>(R.id.tvStatus)

        btnLogin.setOnClickListener {
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString()
            tvStatus.text = when {
                email.isEmpty() -> "Lỗi: Email không được để trống"
                password.isEmpty() -> "Lỗi: Mật khẩu không được để trống"
                !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> "Lỗi: Email sai định dạng"
                password.length < 6 -> "Lỗi: Mật khẩu phải có ít nhất 6 ký tự"
                else -> "Validation Successful!"
            }
        }
    }
}
