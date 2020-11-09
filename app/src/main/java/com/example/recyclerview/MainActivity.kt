package com.example.recyclerview

    import android.graphics.BitmapFactory
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import androidx.recyclerview.widget.LinearLayoutManager
    import androidx.recyclerview.widget.RecyclerView
    import kotlinx.android.synthetic.main.activity_main.*
    class MainActivity : AppCompatActivity() {
        val fc: ArrayList<FootballClub> = ArrayList()
        private lateinit var layoutManager: RecyclerView.LayoutManager
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            fc.add(
                FootballClub(
                    "Chelsea",
                    BitmapFactory.decodeResource(
                        resources, R.drawable.icon1
                    )
                )
            )
            fc.add(
                FootballClub(
                    "Man Utd",
                    BitmapFactory.decodeResource(
                        resources, R.drawable.icon2
                    )
                )
            )
            fc.add(
                FootballClub(
                    "Liverpool",
                    BitmapFactory.decodeResource(
                        resources, R.drawable.icon3
                    )
                )
            )
            layoutManager = LinearLayoutManager(this)
            FootballClub.layoutManager = layoutManager
            FootballClub.adapter = RecyclerViewAdapter(this, fc)
        }
    }