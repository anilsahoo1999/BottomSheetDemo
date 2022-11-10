package com.aks.bottomsheetdemo

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.airbnb.lottie.LottieAnimationView
import com.aks.bottomsheetdemo.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btnModalBottomSheet.setOnClickListener{view->

            showModalBottomSheetDialog()

        }

        binding.btnPersistentBottomSheet.setOnClickListener{
            startActivity(Intent(this,PersistentBottomSheetActivity::class.java))
        }

        binding.btnModalBottomSheetFragment.setOnClickListener{

            showModalBottomSheetFragment()

        }
    }
    private fun showModalBottomSheetDialog(){

            val bottomSheetDialog = BottomSheetDialog(this)
            val view = layoutInflater.inflate(R.layout.modal_bottom_sheet_dialog,null)
            bottomSheetDialog.setContentView(view)
            //access the view
            val lotteImage = view.findViewById<LottieAnimationView>(R.id.splash_lottie)
            with(bottomSheetDialog) {
                setCancelable(true)
                setOnDismissListener(DialogInterface.OnDismissListener {dialog->
                    Toast.makeText(this@MainActivity,"BottomSheet Dismiss",Toast.LENGTH_SHORT).show()
                })
                show()
            }


    }
    private fun showModalBottomSheetFragment(){
        val bottomSheetFragment = BottomSheetFragment()
        bottomSheetFragment.show(supportFragmentManager,bottomSheetFragment.tag)
        bottomSheetFragment.isCancelable = true
    }
}