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


        relax1.setOnClickListener {
            val randomInteger = (0..1).shuffled().first() // 0 or 1 or 2のどれかが取得できる。
            if (randomInteger == 0) {
                intent = Intent(this, Thai::class.java)
                startActivity(intent)
            } else {
                intent = Intent(this, Korea::class.java)
                startActivity(intent)
            }

        }

        activity2.setOnClickListener {
            val randomInteger = (0..2).shuffled().first() // 0 or 1 or 2のどれかが取得できる。
            if (randomInteger == 0) {
                intent = Intent(this, Hawaii::class.java)
                startActivity(intent)
            } else if (randomInteger == 1) {
                intent = Intent(this, Australia::class.java)
                startActivity(intent)
            } else {
                intent = Intent(this, Vietnam::class.java)
                startActivity(intent)
            }


            experience1.setOnClickListener {

                val randomInteger = (0..1).shuffled().first() // 0 or 1 or 2のどれかが取得できる。
                if (randomInteger == 0) {
                    intent = Intent(this, London::class.java)
                    startActivity(intent)
                } else {
                    intent = Intent(this, Brazil::class.java)
                    startActivity(intent)
                }

            }

        }

    }

}
