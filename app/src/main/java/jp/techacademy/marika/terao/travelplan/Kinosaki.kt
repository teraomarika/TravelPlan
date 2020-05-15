package jp.techacademy.marika.terao.travelplan

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_kagawa.*
import kotlinx.android.synthetic.main.activity_kinosaki.*
import kotlinx.android.synthetic.main.activity_kinosaki.hotel_booking
import java.util.*

class Kinosaki : AppCompatActivity() {
    private var mTimer: Timer? = null

    // タイマー用の時間のための変数
    private var mTimerSec = 0.0

    private var mHandler = Handler()

    val Ki1=(R.drawable.kinosaki1)
    val Ki2=(R.drawable.kinosaki2)
    val Ki3=(R.drawable.kinosaki3)
    val Ki4=(R.drawable.kinosaki4)


    val kinosakiList= arrayOf(Ki1,Ki2,Ki3,Ki4)
    var count =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kinosaki)
        //タイマーの作成
        mTimer = Timer()
        // タイマーの始動
        mTimer!!.schedule(object : TimerTask() {
            override fun run() {
                mTimerSec += 0.5
                mHandler.post {
                    kinosakiView.setImageResource(kinosakiList[count])
                    count++
                    if(count==3){
                        count=count-3
                    }

                }
            }
        }, 2000, 2000) // 最初に始動させるまで 100ミリ秒、ループの間隔を 100ミリ秒 に設定


        hotel_booking.setOnClickListener {
            val uri = Uri.parse("https://travel.rakuten.co.jp/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)

        }



    }
}
