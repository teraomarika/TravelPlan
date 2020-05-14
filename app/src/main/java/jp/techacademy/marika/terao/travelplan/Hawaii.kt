package jp.techacademy.marika.terao.travelplan

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_german.*
import kotlinx.android.synthetic.main.activity_hawaii.*
import kotlinx.android.synthetic.main.activity_hawaii.airplan
import kotlinx.android.synthetic.main.activity_hawaii.hotel
import java.util.*

class Hawaii : AppCompatActivity() {

    private var mTimer: Timer? = null

    // タイマー用の時間のための変数
    private var mTimerSec = 0.0

    private var mHandler = Handler()

    val H1=(R.drawable.hawaii1)
    val H2=(R.drawable.hawaii2)
    val H3=(R.drawable.hawaii3)
    val H4=(R.drawable.hawaii4)
    val H5=(R.drawable.hawaii6)
    val H6=(R.drawable.hawaii7)
    val H7=(R.drawable.hawaii8)
    val H8=(R.drawable.hawaii9)
    val H9=(R.drawable.hawaii10)
    val H10=(R.drawable.hawaii11)
    val H11=(R.drawable.hawaii5)


    val hawaiiList= arrayOf(H1,H2,H3,H4,H5,H6,H7,H8,H9,H10,H11)
    var count=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hawaii)

        //タイマーの作成
        mTimer = Timer()
        // タイマーの始動
        mTimer!!.schedule(object : TimerTask() {
            override fun run() {
                mTimerSec += 0.5
                mHandler.post {
                    hawaiiView.setImageResource(hawaiiList[count])
                    count++
                    if (count == 10) {
                        count = count - 10
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
