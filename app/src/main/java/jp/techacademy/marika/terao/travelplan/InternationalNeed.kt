package jp.techacademy.marika.terao.travelplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hawaii.*
import kotlinx.android.synthetic.main.activity_international_need.*
import kotlinx.android.synthetic.main.activity_japan_need.*

class InternationalNeed : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_international_need)


        relax1.setOnClickListener{
            intent= Intent(this,Thai::class.java)
            startActivity(intent)
        }

        activity2.setOnClickListener{
            intent=Intent(this,Hawaii::class.java)
            startActivity(intent)
        }

        experience1.setOnClickListener{
            intent=Intent(this,London::class.java)
            startActivity(intent)
        }
    }



}
