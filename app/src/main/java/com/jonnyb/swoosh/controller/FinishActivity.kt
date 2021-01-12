package com.jonnyb.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jonnyb.swoosh.R
import com.jonnyb.swoosh.model.Player
import com.jonnyb.swoosh.util.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchLeaguesText.text = "Looking for a ${player?.league} ${player?.skill} league near you..."
    }
}