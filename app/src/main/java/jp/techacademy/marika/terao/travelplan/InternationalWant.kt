package jp.techacademy.marika.terao.travelplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_international_want.*


class InternationalWant : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_international_want)


        reflesh.setOnClickListener {
            intent = Intent(this, Philippines::class.java)
            startActivity(intent)
        }

        shopping.setOnClickListener {
            val randomInteger = (0..1).shuffled().first() // 0 or 1 or 2のどれかが取得できる。
            if (randomInteger == 0) {
                intent = Intent(this, Vietnam::class.java)
                startActivity(intent)
            } else {
                intent = Intent(this, Korea::class.java)
                startActivity(intent)
            }
        }


    }

}
