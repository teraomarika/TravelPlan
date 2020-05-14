package jp.techacademy.marika.terao.travelplan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_australia.*
import kotlinx.android.synthetic.main.activity_hawaii.*
import java.util.*

class Australia : AppCompatActivity() {


    private var mTimer: Timer? = null

    // タイマー用の時間のための変数
    private var mTimerSec = 0.0

    private var mHandler = Handler()

    val A1=(R.drawable.aus1)
    val A2=(R.drawable.aus2)
    val A3=(R.drawable.aus3)
    val A4=(R.drawable.aus4)
    val A5=(R.drawable.aus6)
    val A6=(R.drawable.aus7)
    val A7=(R.drawable.aus8)
    val A8=(R.drawable.aus9)
    val A9=(R.drawable.aus10)



    val ausList= arrayOf(A1,A2,A3,A4,A5,A6,A7,A8,A9)
    var count=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_australia)


        //タイマーの作成
        mTimer = Timer()
        // タイマーの始動
        mTimer!!.schedule(object : TimerTask() {
            override fun run() {
                mTimerSec += 0.5
                mHandler.post {
                    ausView.setImageResource(ausList[count])
                    count++
                    if (count == 8) {
                        count = count - 8
                    }

                }
            }
        }, 2000, 2000) // 最初に始動させるまで 100ミリ秒、ループの間隔を 100ミリ秒 に設定


    }
}
