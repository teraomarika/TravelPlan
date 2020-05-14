package jp.techacademy.marika.terao.travelplan

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_german.*
import kotlinx.android.synthetic.main.activity_vietnam.*
import kotlinx.android.synthetic.main.activity_vietnam.airplan
import kotlinx.android.synthetic.main.activity_vietnam.hotel
import java.util.*

class Vietnam : AppCompatActivity() {


    private var mTimer: Timer? = null

    // タイマー用の時間のための変数
    private var mTimerSec = 0.0

    private var mHandler = Handler()


    val V1=(R.drawable.vietnum1)
    val V2=(R.drawable.vietnam2)
    val V3=(R.drawable.vietnam3)
    val V4=(R.drawable.vietnam4)
    val V5=(R.drawable.vietnam5)
    val V6=(R.drawable.vietnam6)
    val V7=(R.drawable.vietnam7)
    val V8=(R.drawable.vietnam8)
    val V9=(R.drawable.vietnam9)
    val V10=(R.drawable.vietnam10)

    val vietnamList= arrayOf(V1,V2,V3,V4,V5,V6,V7,V8,V9,V10)
    var count:Int=0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vietnam)
        //タイマーの作成
        mTimer = Timer()
        // タイマーの始動
        mTimer!!.schedule(object : TimerTask() {
            override fun run() {
                mTimerSec += 0.5
                mHandler.post {
                    vietnamView.setImageResource(vietnamList[count])
                    count++
                    if(count==9){
                        count=count-9
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
