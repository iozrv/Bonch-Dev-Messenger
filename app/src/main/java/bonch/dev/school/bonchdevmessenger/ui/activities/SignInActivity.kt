package bonch.dev.school.bonchdevmessenger.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import bonch.dev.school.bonchdevmessenger.R

class SignInActivity : AppCompatActivity() {
    private lateinit var signUpButton: Button
    private lateinit var signInButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.SignInTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        signUpButton = findViewById(R.id.sign_up_button)

        signUpButton.setOnClickListener({
            val intent = Intent(this@SignInActivity, SignUpActivity::class.java)
            startActivity(intent)
        })
        signInButton = findViewById(R.id.sign_in_button)

        signInButton.setOnClickListener({
            val intent = Intent(this@SignInActivity, MainAppActivity::class.java)
            startActivity(intent)

        })





    }
}
