package jp.techacademy.marika.terao.travelplan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_kagawa.*
import java.util.*

class Kagawa : AppCompatActivity() {

    private var mTimer: Timer? = null

    // タイマー用の時間のための変数
    private var mTimerSec = 0.0

    private var mHandler = Handler()

    val K1=(R.drawable.kagawa1)
    val K2=(R.drawable.kagawa2)
    val K3=(R.drawable.kagawa3)
    val K4=(R.drawable.kagawa4)
    val K5=(R.drawable.kagawa5)
    val K6=(R.drawable.kagawa6)
    val K7=(R.drawable.kagawa7)

    val kagawaList= arrayOf(K1,K2,K3,K4,K5,K6,K7)
    var count =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kagawa)
        //タイマーの作成
        mTimer = Timer()
        // タイマーの始動
        mTimer!!.schedule(object : TimerTask() {
            override fun run() {
                mTimerSec += 0.5
                mHandler.post {
                    kagawaView.setImageResource(kagawaList[count])
                    count++
                    if(count==6){
                        count=count-6
                    }

                }
            }
        }, 2000, 2000) // 最初に始動させるまで 100ミリ秒、ループの間隔を 100ミリ秒 に設定


    }
}
