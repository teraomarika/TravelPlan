package jp.techacademy.marika.terao.travelplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_japan.setOnClickListener {
            val intent = Intent(this, japan_need::class.java)
            startActivity(intent)
        }

        button_international.setOnClickListener {
            val intent = Intent(this, international_howlong::class.java)
            startActivity(intent)
        }

    }
}
