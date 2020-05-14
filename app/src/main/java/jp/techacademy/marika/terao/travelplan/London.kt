package jp.techacademy.marika.terao.travelplan

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_german.*
import kotlinx.android.synthetic.main.activity_london.*
import kotlinx.android.synthetic.main.activity_london.airplan
import kotlinx.android.synthetic.main.activity_london.hotel
import java.util.*

class London : AppCompatActivity() {

    private var mTimer: Timer? = null

    // タイマー用の時間のための変数
    private var mTimerSec = 0.0

    private var mHandler = Handler()


    val L1=(R.drawable.london1)
    val L2=(R.drawable.london2)
    val L3=(R.drawable.london3)
    val L4=(R.drawable.london4)




    val londonList= arrayOf(L1,L2,L3,L4)
    var count:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_london)

        //タイマーの作成
        mTimer = Timer()
        // タイマーの始動
        mTimer!!.schedule(object : TimerTask() {
            override fun run() {
                mTimerSec += 0.5
                mHandler.post {
                    londonView.setImageResource(londonList[count])
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
