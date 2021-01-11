package com.jonnyb.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jonnyb.swoosh.R
import com.jonnyb.swoosh.util.EXTRA_LEAGUE
import com.jonnyb.swoosh.util.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for a $league $skill league near you..."
    }
}