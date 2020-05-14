package jp.techacademy.marika.terao.travelplan

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_brazil.*
import java.util.*

class Brazil : AppCompatActivity() {
    private var mTimer: Timer? = null

    // タイマー用の時間のための変数
    private var mTimerSec = 0.0

    private var mHandler = Handler()

    val B1 = (R.drawable.brazil4)
    val B2 = (R.drawable.brazil2)
    val B3 = (R.drawable.brazill1)
    val B4 = (R.drawable.brazil3)
    val B5 = (R.drawable.brazil5)

    val BrazilList = arrayOf(B1,B2,B3,B4,B5)
    var count = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brazil)


        //タイマーの作成
        mTimer = Timer()
        // タイマーの始動
        mTimer!!.schedule(object : TimerTask() {
            override fun run() {
                mTimerSec += 0.5
                mHandler.post {
                    BrazilView.setImageResource(BrazilList[count])
                    count++
                    if (count == 4 ){
                        count = count - 4
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
