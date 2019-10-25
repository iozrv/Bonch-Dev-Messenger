package bonch.dev.school.bonchdevmessenger.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import bonch.dev.school.bonchdevmessenger.R
import bonch.dev.school.bonchdevmessenger.ui.activities.MainAppActivity
import kotlinx.android.synthetic.*

private lateinit var changePassButton: Button

class ProfileFragment:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        changePassButton = view.findViewById(R.id.change_password_button)

        changePassButton.setOnClickListener({
            (context as MainAppActivity).showChangePassFragment()
        })
        return view
    }
}