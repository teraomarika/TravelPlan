package jp.techacademy.marika.terao.travelplan

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_german.*
import kotlinx.android.synthetic.main.activity_korea.*
import kotlinx.android.synthetic.main.activity_korea.airplan
import kotlinx.android.synthetic.main.activity_korea.hotel
import java.util.*

class Korea : AppCompatActivity() {


    private var mTimer: Timer? = null

    // タイマー用の時間のための変数
    private var mTimerSec = 0.0

    private var mHandler = Handler()


    val K1=(R.drawable.korea1)
    val K2=(R.drawable.korea2)
    val K3=(R.drawable.korea3)
    val K4=(R.drawable.korea4)

    val koreaList= arrayOf(K1,K2,K3,K4)
    var count=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korea)

        mTimer = Timer()
        // タイマーの始動
        mTimer!!.schedule(object : TimerTask() {
            override fun run() {
                mTimerSec += 0.5
                mHandler.post {
                    koreaView.setImageResource(koreaList[count])
                    count++
                    if(count==3){
                        count=count-3
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
