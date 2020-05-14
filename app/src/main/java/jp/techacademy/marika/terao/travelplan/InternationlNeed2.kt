package jp.techacademy.marika.terao.travelplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_internationl_need2.*

class InternationlNeed2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_internationl_need2)

        chill.setOnClickListener{
            intent= Intent(this,Australia::class.java)
            startActivity(intent)
        }



        adventure.setOnClickListener{

            val randomInteger = (0..1).shuffled().first() // 0 or 1 or 2のどれかが取得できる。
            if (randomInteger == 0) {
                intent = Intent(this, Philippines::class.java)
                startActivity(intent)
            } else {
                intent = Intent(this, German::class.java)
                startActivity(intent)}

        }

    }
}
