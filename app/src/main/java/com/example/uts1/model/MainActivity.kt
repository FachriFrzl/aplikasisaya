package com.example.uts1.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.uts1.Fragment.DailyFragment
import com.example.uts1.Fragment.HomeFragment
import com.example.uts1.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menu: Menu = bottom_nav.menu
        selectedMenu(menu.getItem(0))
        bottom_nav.setOnNavigationItemSelectedListener { item: MenuItem ->
            selectedMenu(item)
            false
        }
    }
        private fun selectedMenu(item: MenuItem) {
            item.isChecked = true
            when (item.itemId) {
                R.id.home -> selectedFragment(HomeFragment.getInstance())
                R.id.daily -> selectedFragment(DailyFragment.getInstance())
            }
        }

        fun selectedFragment(fragment: Fragment) {
            val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frameLayout_home, fragment)
            transaction.commit()
        }
    }

