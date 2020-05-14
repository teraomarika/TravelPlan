package jp.techacademy.marika.terao.travelplan

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_german.*
import java.util.*

class German : AppCompatActivity() {

    private var mTimer: Timer? = null

    // タイマー用の時間のための変数
    private var mTimerSec = 0.0

    private var mHandler = Handler()

    val G1=(R.drawable.german1)
    val G2=(R.drawable.german2)
    val G3=(R.drawable.german3)

    val germanList= arrayOf(G1,G2,G3)
    var count=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_german)
        //タイマーの作成
        mTimer = Timer()
        // タイマーの始動
        mTimer!!.schedule(object : TimerTask() {
            override fun run() {
                mTimerSec += 0.5
                mHandler.post {
                    germanView.setImageResource(germanList[count])
                    count++
                    if (count == 2) {
                        count = count - 2
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
