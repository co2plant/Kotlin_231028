package kr.ac.wku.kotlin_231028

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import kr.ac.wku.kotlin_231028.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(R.layout.activity_main)

        binding.btnCreateLog.setOnClickListener(){
            Log.d("Main","kimchimand sibalsaekiya")
        }

        binding.btnToast.setOnClickListener{
            Toast.makeText(this, "Toasts", Toast.LENGTH_SHORT).show()
        }
    }
}