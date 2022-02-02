package dev.matyaqubov.telegramwelcome.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import java.util.ArrayList

class ViewPagerAdapter(private val fr:FragmentManager) : FragmentPagerAdapter(fr) {
    private val fragments = ArrayList<Fragment>()

    fun add(fragment: Fragment) {
        fragments.add(fragment)
    }

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }
}