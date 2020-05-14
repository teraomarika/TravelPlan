package jp.techacademy.marika.terao.travelplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_international_howlong.*

class InternationalHowlong : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_international_howlong)

        afewdays.setOnClickListener{
            intent= Intent(this,InternationalWant::class.java)
            startActivity(intent)
        }
        aweek.setOnClickListener{
            intent=Intent(this,InternationalNeed::class.java)
            startActivity(intent)
        }
        more.setOnClickListener{
            intent=Intent(this,InternationlNeed2::class.java)
            startActivity(intent)
        }

    }
}
