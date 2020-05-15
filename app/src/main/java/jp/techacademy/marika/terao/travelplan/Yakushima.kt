package jp.techacademy.marika.terao.travelplan

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_kagawa.*
import kotlinx.android.synthetic.main.activity_yakushima.*
import kotlinx.android.synthetic.main.activity_yakushima.hotel_booking
import java.util.*

class Yakushima : AppCompatActivity() {



        private var mTimer: Timer? = null

        // タイマー用の時間のための変数
        private var mTimerSec = 0.0

        private var mHandler = Handler()

        val Y1=(R.drawable.yaku1)
        val Y2=(R.drawable.yaku2)
        val Y3=(R.drawable.yaku3)
        val Y4=(R.drawable.yaku5)


        val kagawaList= arrayOf(Y1,Y2,Y3,Y4)
        var count =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yakushima)

            //タイマーの作成
            mTimer = Timer()
            // タイマーの始動
            mTimer!!.schedule(object : TimerTask() {
                override fun run() {
                    mTimerSec += 0.5
                    mHandler.post {
                        yakuView.setImageResource(kagawaList[count])
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
