package dev.matyaqubov.telegramwelcome.activity

import android.app.assist.AssistContent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator
import dev.matyaqubov.telegramwelcome.R
import dev.matyaqubov.telegramwelcome.adapter.ViewPagerAdapter
import dev.matyaqubov.telegramwelcome.fragment.*
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var viewpagerAdapter: ViewPagerAdapter
    private lateinit var viewpager: ViewPager
    private lateinit var dots: WormDotsIndicator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()

    }

    private fun initViews() {
        viewpager=findViewById(R.id.view_pager)
        dots=findViewById(R.id.dots)
        addfragment()
        dots.setViewPager(viewpager)
    }

    private fun addfragment() {
        viewpagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewpagerAdapter.add(TelegramXFragment())
        viewpagerAdapter.add(FastFragment())
        viewpagerAdapter.add(FreeFragment())
        viewpagerAdapter.add(PowerfulFragment())
        viewpagerAdapter.add(SecureFragment())
        viewpagerAdapter.add(CloudbasedFragment())

        refreshAdapter()
    }

    private fun refreshAdapter() {
        viewpager.adapter=viewpagerAdapter

    }
}