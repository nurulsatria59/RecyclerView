package com.example.recyclerview

    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import android.widget.Toast
    import androidx.recyclerview.widget.RecyclerView
    import kotlinx.android.synthetic.main.list_item_view.view.*
    class RecyclerViewAdapter(private val context: MainActivity, private val FootballList:
    ArrayList<FootballClub>) :
        RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
                ViewHolder {
            return ViewHolder(LayoutInflater.from(context).inflate(
                R.layout.list_item_view, parent, false))
        }
        override fun getItemCount(): Int {
            return FootballList.size
        }
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bindItems(FootballList[position])
        }
        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val FootballLogo = view.imgFootballLogo
            val FootballName = view.txtFootballName
            fun bindItems(data : FootballClub){
                FootballLogo?.setImageBitmap(data.logo)
                FootballName?.text = data.nama
                itemView.setOnClickListener {
                    val text = data.nama
                    Toast.makeText(itemView.context, text,
                        Toast.LENGTH_LONG).show()
                }
            }
        }
    }