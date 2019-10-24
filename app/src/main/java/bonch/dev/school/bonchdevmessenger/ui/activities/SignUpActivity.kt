package bonch.dev.school.bonchdevmessenger.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import bonch.dev.school.bonchdevmessenger.R
    private lateinit var signUpButton: Button
class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.SignInTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        signUpButton = findViewById(R.id.complete_sign_up_button)

        signUpButton.setOnClickListener({
            val intent = Intent(this@SignUpActivity, MainAppActivity::class.java)
            startActivity(intent)


        })

    }
}
