package com.aks.bottomsheetdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.databinding.DataBindingUtil
import com.aks.bottomsheetdemo.databinding.ActivityPersistentBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class PersistentBottomSheetActivity : AppCompatActivity() {
    lateinit var binding : ActivityPersistentBottomSheetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_persistent_bottom_sheet)


    }
}