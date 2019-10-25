package bonch.dev.school.bonchdevmessenger.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import bonch.dev.school.bonchdevmessenger.R
import bonch.dev.school.bonchdevmessenger.ui.activities.MainAppActivity


private lateinit var sendButton: Button
class ChatFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_chat, container, false)
        sendButton = view.findViewById(R.id.send_message_button)
        sendButton.setOnClickListener({
            (context as MainAppActivity).replaceFragment()
        })




        return view
    }

}
