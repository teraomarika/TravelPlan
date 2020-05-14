package jp.techacademy.marika.terao.travelplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_japan_need.*

class JapanNeed : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_japan_need)

        relax.setOnClickListener {
            intent = Intent(this, Kinosaki::class.java)
            startActivity(intent)
        }

        adventure.setOnClickListener {
            val randomInteger = (0..1).shuffled().first() // 0 or 1 or 2のどれかが取得できる。
            if (randomInteger == 0) {
                intent = Intent(this, Wakayama::class.java)
                startActivity(intent)
            } else {
                intent = Intent(this, Yakushima::class.java)
                startActivity(intent)
            }
        }

        art.setOnClickListener {
            intent = Intent(this, Kagawa::class.java)
            startActivity(intent)
        }

    }
}
