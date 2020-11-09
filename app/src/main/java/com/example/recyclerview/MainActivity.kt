package com.example.recyclerview

    import android.graphics.BitmapFactory
    import android.os.Bundle
    import androidx.appcompat.app.AppCompatActivity
    import androidx.recyclerview.widget.GridLayoutManager
    import androidx.recyclerview.widget.RecyclerView
    import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
        private val fc: ArrayList<FootballClub> = ArrayList()
        private lateinit var layoutManager: RecyclerView.LayoutManager
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            fc.add(
                FootballClub(
                    "Chelsea 1",
                    BitmapFactory.decodeResource(
                        resources, R.drawable.icon1
                    )
                )
            )
            fc.add(
                FootballClub(
                    "Man Utd 1",
                    BitmapFactory.decodeResource(
                        resources, R.drawable.icon2
                    )
                )
            )
            fc.add(
                FootballClub(
                    "Liverpool 1",
                    BitmapFactory.decodeResource(
                        resources, R.drawable.icon3
                    )
                )
            )
            fc.add(
                FootballClub(
                    "Chelsea 2",
                    BitmapFactory.decodeResource(
                        resources, R.drawable.icon1
                    )
                )
            )
            fc.add(
                FootballClub(
                    "Man Utd 2",
                    BitmapFactory.decodeResource(
                        resources, R.drawable.icon2
                    )
                )
            )
            fc.add(
                FootballClub(
                    "Liverpool ",
                    BitmapFactory.decodeResource(
                        resources, R.drawable.icon3
                    )
                )
            )
            fc.add(
                FootballClub(
                    "Chelsea 3",
                    BitmapFactory.decodeResource(
                        resources, R.drawable.icon1
                    )
                )
            )
            fc.add(
                FootballClub(
                    "Man Utd 3",
                    BitmapFactory.decodeResource(
                        resources, R.drawable.icon2
                    )
                )
            )
            fc.add(
                FootballClub(
                    "Liverpool 3",
                    BitmapFactory.decodeResource(
                        resources, R.drawable.icon3
                    )
                )
            )
            layoutManager = GridLayoutManager(this,3)
            FootballClub.layoutManager = layoutManager
            FootballClub.adapter = RecyclerViewAdapter(this, fc)
        }
    }