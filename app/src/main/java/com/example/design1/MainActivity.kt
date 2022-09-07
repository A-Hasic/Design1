package com.example.design1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<RecyclerView>(R.id.recyclerView).apply {
            adapter = MessageAdapter(
                listOf(
                    Message(
                        "This is a salfe",
                        "I can send you message",
                        "2 Aug 2022",
                        "09:00 AM"
                    ),
                    Message(
                        "This is a salfe",
                        "I can send you message",
                        "2 Aug 2022",
                        "09:00 AM"
                    ),
                    Message(
                        "This is a salfe",
                        "I can send you message",
                        "2 Aug 2022",
                        "09:00 AM"
                    ),Message(
                        "This is a salfe",
                        "I can send you message",
                        "2 Aug 2022",
                        "09:00 AM"
                    ),Message(
                        "This is a salfe",
                        "I can send you message",
                        "2 Aug 2022",
                        "09:00 AM"
                    )
                )
            )
            layoutManager = LinearLayoutManager(context)
        }
    }
}

data class Message(
    val title: String,
    val text: String,
    val date: String,
    val time: String
)

class MessageAdapter(
    val items: List<Message>
) : RecyclerView.Adapter<MessageAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image = view.findViewById<ImageView>(R.id.imageView)
        val title = view.findViewById<TextView>(R.id.this_is_a)
        val text = view.findViewById<TextView>(R.id.i_can_send)
        val date = view.findViewById<TextView>(R.id.august_2)
        val time = view.findViewById<TextView>(R.id.am)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val message = items[position]

//        holder.image.setImageResource(message.imageUrl)
        holder.title.text = message.title
        holder.text.text = message.text
        holder.date.text = message.date
        holder.time.text = message.time

    }

    override fun getItemCount(): Int {
        return items.size
    }

}