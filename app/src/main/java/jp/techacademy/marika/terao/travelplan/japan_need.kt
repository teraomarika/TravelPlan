package jp.techacademy.marika.terao.travelplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_japan_need.*

class japan_need : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_japan_need)

        relax.setOnClickListener {
            intent = Intent(this, kinosaki::class.java)
            startActivity(intent)
        }

        adventure.setOnClickListener{
            intent=Intent(this, wakayama::class.java)
            startActivity(intent)
        }

        art.setOnClickListener{
            intent=Intent(this,kagawa::class.java)
            startActivity(intent)
        }

    }
}
