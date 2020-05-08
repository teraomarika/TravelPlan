package jp.techacademy.marika.terao.travelplan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_wakayama.*
import java.util.*

class wakayama : AppCompatActivity() {

    private var mTimer: Timer? = null

    // タイマー用の時間のための変数
    private var mTimerSec = 0.0

    private var mHandler = Handler()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wakayama)

        // タイマーの作成
        mTimer = Timer()
//        // タイマーの始動
//        mTimer!!.schedule(object : TimerTask() {
//            override fun run() {
//                mTimerSec += 0.1
//                mHandler.post {
//                    wakayamaView.text = String.format("%.1f", mTimerSec)
//                }
//            }
//        }, 100, 100) // 最初に始動させるまで 100ミリ秒、ループの間隔を 100ミリ秒 に設定
//
//
//    }
    }
}

