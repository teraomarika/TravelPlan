package jp.techacademy.marika.terao.travelplan

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_german.*
import kotlinx.android.synthetic.main.activity_philippines.*
import kotlinx.android.synthetic.main.activity_philippines.airplan
import kotlinx.android.synthetic.main.activity_philippines.hotel
import java.util.*

class Philippines : AppCompatActivity() {

    private var mTimer: Timer? = null

    // タイマー用の時間のための変数
    private var mTimerSec = 0.0

    private var mHandler = Handler()

    val P1 = (R.drawable.ph1)
    val P2 = (R.drawable.ph2)
    val P3 = (R.drawable.ph3)
    val P4 = (R.drawable.ph4)
    val P5 = (R.drawable.ph5)
    val P6 = (R.drawable.ph7)

    val PList = arrayOf(P1,P2,P3,P4,P5,P6)
    var count = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_philippines)





        //タイマーの作成
        mTimer = Timer()
        // タイマーの始動
        mTimer!!.schedule(object : TimerTask() {
            override fun run() {
                mTimerSec += 0.5
                mHandler.post {
                    philippinesView.setImageResource(PList[count])
                    count++
                    if (count == 5) {
                        count = count - 5
                    }

                }
            }
        }, 2000, 2000) // 最初に始動させるまで 100ミリ秒、ループの間隔を 100ミリ秒 に設定

        airplan.setOnClickListener{
            val uri = Uri.parse("https://www.skyscanner.jp/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)

        }

        hotel.setOnClickListener {
            val uri = Uri.parse("https://www.booking.com/index.ja.html")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)

        }


    }
}
