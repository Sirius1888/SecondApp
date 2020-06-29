package com.example.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.second.extension.loadImage
import com.example.second.extension.showToast
import com.example.second.model.Contact
import com.example.second.model.Member
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val contacts = mutableListOf<Member>() // read/write
    private val contactsArrayList = ArrayList<Member>()
    private val contactsList = List<Member>(1) { Member(phone = "99670000001", isFriend = true) }//read-only
    val myContact = Contact() // kotlin
    // Contact contact = new Contact(); //java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addContacts()
        displayContacts()

        image.loadImage("http://goo.gl/gEgYUd", applicationContext)
    }

    private fun loadImage(url: String, imageView: ImageView) {
        Glide.with(this)
            .load("http://goo.gl/gEgYUd")
            .into(image);
    }

    private fun displayContacts() {

        for (contact in contacts) {
            var name: String = ""
            if (contact.name != null) {
                name = contact.name!!
            }

//            contact.name.let { name = it /* String? -> String*/ }
            var phone = contact.phone!!
            Log.v("Contacts_item", contact.name.toString())
        }
        applicationContext.showToast("EXTENSION TOAST")
    }

    private fun addContacts() {
        contacts.add(Member("Аят", "99670000000", true))
        contacts.add(Member(phone = "99670000001", isFriend = true))
        contacts.add(Member(phone = "99670000007", isFriend = true))
    }

    // Первоначально добавляем в массив 5 рандомных url картинок.
    // В xml вы добавляете ImageView, EditText, Button, RandomButton
    // При ввводе и нажатии кнопки submit в массив добавляете урл картинки
    // при нажатии на рандомБаттон вы рандомно через глайд выводите картинку

}
