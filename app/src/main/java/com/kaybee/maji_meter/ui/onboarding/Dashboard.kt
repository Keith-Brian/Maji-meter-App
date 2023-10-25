package com.kaybee.maji_meter.ui.onboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kaybee.maji_meter.R
import com.kaybee.maji_meter.databinding.ActivityDashboardBinding

class Dashboard : AppCompatActivity() {
    private lateinit var dashboardBinding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dashboardBinding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(dashboardBinding.root)


    }
}