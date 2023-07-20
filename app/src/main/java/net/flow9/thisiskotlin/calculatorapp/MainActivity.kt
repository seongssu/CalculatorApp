package net.flow9.thisiskotlin.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var expression: TextView

    //lateinit의경우 계속해서 값이 변경될 수 있는 속성을 위해 무조건 var을 사용해야한다.
    //Int,Float,Double,Long에는 사용할 수 없다.
    //var expression: String? =null 을 쓰면 어짜피 이후에 사용해야하는데 굳이 위험하게 초기상태로 null을 사용할 필요가 없다.
    //그래서 늦은초기화 lateinit을 사용한다. 자세한내용은 4주차 강의 지연초기화를 다시보자.
    private lateinit var result: TextView
    private lateinit var clear: Button
    private lateinit var backSpace: Button
    private lateinit var percent:Button
    private lateinit var divide:Button
    private lateinit var multiply:Button
    private lateinit var add:Button
    private lateinit var subtract:Button
    private lateinit var equal:Button
    private lateinit var dot:Button
    private lateinit var zero:Button
    private lateinit var doubleZero:Button
    private lateinit var one:Button
    private lateinit var two:Button
    private lateinit var three:Button
    private lateinit var four:Button
    private lateinit var five:Button
    private lateinit var six:Button
    private lateinit var seven:Button
    private lateinit var eight:Button
    private lateinit var nine:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}