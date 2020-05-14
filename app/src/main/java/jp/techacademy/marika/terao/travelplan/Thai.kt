package jp.techacademy.marika.terao.travelplan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_thai.*
import java.util.*

class Thai : AppCompatActivity() {

    private var mTimer: Timer? = null

    // タイマー用の時間のための変数
    private var mTimerSec = 0.0

    private var mHandler = Handler()

    val T1 = (R.drawable.thai1)
    val T2 = (R.drawable.thai2)
    val T3 = (R.drawable.thai3)
    val T4 = (R.drawable.thai4)
    val T5 = (R.drawable.thai5)
    val T6 = (R.drawable.thai6)
    val T7 = (R.drawable.thai7)
    val T8 = (R.drawable.thai8)
    val T9 = (R.drawable.thai9)

    val thaiList = arrayOf(T1, T2, T3, T4, T5, T6, T7, T8, T9)
    var count = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thai)


        //タイマーの作成
        mTimer = Timer()
        // タイマーの始動
        mTimer!!.schedule(object : TimerTask() {
            override fun run() {
                mTimerSec += 0.5
                mHandler.post {
                    thaiView.setImageResource(thaiList[count])
                    count++
                    if (count == 8) {
                        count = count - 8
                    }

                }
            }
        }, 2000, 2000) // 最初に始動させるまで 100ミリ秒、ループの間隔を 100ミリ秒 に設定


    }
}


