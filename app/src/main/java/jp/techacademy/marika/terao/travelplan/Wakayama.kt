package jp.techacademy.marika.terao.travelplan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import kotlinx.android.synthetic.main.activity_wakayama.*
import java.util.*

class Wakayama : AppCompatActivity(){








    private var mTimer: Timer? = null

    // タイマー用の時間のための変数
    private var mTimerSec = 0.0

    private var mHandler = Handler()


    val W1=(R.drawable.wakayama1)
    val W2=(R.drawable.wakayama2)
    val W3=(R.drawable.wakayama3)
    val W4=(R.drawable.wakayama4)
    val W5=(R.drawable.wakayama5)
    val W6=(R.drawable.wakayama7)
    val W7=(R.drawable.wakayama8)
    val W8=(R.drawable.wakayama9)
    val W9=(R.drawable.wakayama10)

    val wakayamaList= arrayOf(W1,W2,W3,W4,W5,W6,W7,W8,W9)
    var count:Int=0




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wakayama)

        //タイマーの作成
        mTimer = Timer()
        // タイマーの始動
        mTimer!!.schedule(object : TimerTask() {
            override fun run() {
                mTimerSec += 0.5
                mHandler.post {
                    wakayamaView.setImageResource(wakayamaList[count])
                    count++
                    if(count==9){
                        count=count-9
                    }

                }
            }
        }, 2000, 2000) // 最初に始動させるまで 100ミリ秒、ループの間隔を 100ミリ秒 に設定


    }
    }
