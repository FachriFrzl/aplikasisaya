package com.example.uts1.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.fragment.app.Fragment
import com.example.uts1.R
import com.example.uts1.SetDataDummy
import com.example.uts1.model.Friendlist

class DailyFragment : Fragment() {
    companion object{
        fun getInstance() : DailyFragment = DailyFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_daily ,container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setdaily()
    }
    fun setdaily(){
        val datateman : ArrayList<Friendlist> = Friendlist.setDataTeman()
    }
    fun datadaily(){
        val list = ArrayList<Friendlist>()
        val listFriendlist = arrayOf(
            "dean",
            "oga",
            "dion"
        )
        for (i in 0 until listFriendlist.size)
        {
            
        }
    }
}