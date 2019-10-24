package bonch.dev.school.bonchdevmessenger.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bonch.dev.school.bonchdevmessenger.R
import bonch.dev.school.bonchdevmessenger.ui.fragments.ChatFragment
import bonch.dev.school.bonchdevmessenger.ui.fragments.ProfileFragment
import kotlinx.android.synthetic.main.activity_main_app.*

class MainAppActivity : AppCompatActivity() {
    val fm = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_app)
        val chatFragment = ChatFragment()

        fm.beginTransaction()
            .add(R.id.placeForFragment, chatFragment)
            .commit()

    }
    fun replaceFragment(){
        val fragment = ProfileFragment()
        fm.beginTransaction()
            .replace(R.id.placeForFragment, fragment)
            .addToBackStack("fragment_chat")
            .commit()
    }
}
