package edu.temple.audiobb

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(val context: Context, val books: List<Book>) :RecyclerView.Adapter<BookAdapter.bookViewHolder>() {
    inner class bookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        LayoutInflator.from(context).inflate(R.layout.list_item, parent, false)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): bookViewHolder {

    }

    override fun onBindViewHolder(holder: bookViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return books.size
    }
}