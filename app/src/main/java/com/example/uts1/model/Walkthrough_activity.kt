package com.example.uts1.model

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.uts1.R
import com.example.uts1.adapter.PagerAdapter
import kotlinx.android.synthetic.main.activity_walk.*

class Walkthrough_activity : AppCompatActivity() {
    private lateinit var viewPagerAdapter: PagerAdapter
    private var data: List<PagerModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walk)

        setData()

        viewpager2_main.adapter     = viewPagerAdapter
        viewpager2_main.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        circleindicator_main.setViewPager(viewpager2_main)

        viewpager2_main.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
            getStartedAnimation(position)
            }
        })
        btn_next.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    fun setData(){
        data = PagerModel.setDataViewPager()
        viewPagerAdapter = PagerAdapter()
        viewPagerAdapter.setPagerAdapter(data)
    }
    fun getStartedAnimation(position:Int)
    {
            if (position == data.size-1)
            {
                btn_next.apply {
                    alpha = 0f
                    visibility = View.VISIBLE
                    animate()
                        .alpha(1f)
                        .setDuration(1500)

                }
            }
        else{
                btn_next.visibility = View.INVISIBLE
            }
    }

}