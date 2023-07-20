package net.flow9.thisiskotlin.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var expression: TextView
    //lateinit의경우 계속해서 값이 변경될 수 있는 속성을 위해 무조건 var을 사용해야한다.
    //Int,Float,Double,Long에는 사용할 수 없다.
    //var expression: String? =null 을 쓰면 어짜피 이후에 사용해야하는데 굳이 위험하게 초기상태로 null을 사용할 필요가 없다.
    //그래서 늦은초기화 lateinit을 사용한다. 자세한내용은 4주차 강의 지연초기화를 다시보자.
    //private은 동일한 클래스 내부에서만 사용할 수있다.
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

        expression =findViewById(R.id.expression)
        //R.id.접두어 : 위젯을 클릭 시 발생하는 어떤 코드를 작성하려할때 해당 위젯에 R.id.위젯ID의 형태로 작성한다.
        //안드로이드가 리소스를 관리하는 R이라는 클래스를 생성하고, 그 안에 리소스 아이디를 관리하는 id클래스가 추가되는것이다.
        //findViewById : 처음 안드로이드를 접할때 원하는 뷰에 접근하기위해서 해당 메소드를 사용한다.
        //: id값을 이용해 특정뷰를 받아와주는 메소드 https://holika.tistory.com/86참조
        result = findViewById(R.id.result)
        clear = findViewById(R.id.clear)
        backSpace = findViewById(R.id.backspace)
        percent = findViewById(R.id.percent)
        divide = findViewById(R.id.divide)
        multiply = findViewById(R.id.multiply)
        add = findViewById(R.id.add)
        subtract = findViewById(R.id.subtract)
        equal = findViewById(R.id.equal)
        dot = findViewById(R.id.dot)
        zero = findViewById(R.id.zero)
        doubleZero = findViewById(R.id.zero)
        one = findViewById(R.id.one)
        two = findViewById(R.id.two)
        three = findViewById(R.id.three)
        four = findViewById(R.id.four)
        five = findViewById(R.id.five)
        six = findViewById(R.id.six)
        seven = findViewById(R.id.seven)
        eight = findViewById(R.id.eight)
        nine = findViewById(R.id.nine)

        expression.movementMethod = ScrollingMovementMethod()
        expression.isActivated = true
        expression.isPressed = true

        var str:String
        //Listener : 위젯에서 발생한 특정 이벤트를 처리하기위해 리스너를 사용한다. 즉 어떤 이벤트의 발생 여부에 귀기울이는 객체
        //버튼에서 발생할 수있는 클릭 이벤트는 부모 클래스에서 정의를 한다.
        //이벤트 발생 시 호출될 함수를 구현한 리스너 객체를 생성하여 Button에 지정
        //참조 : https://recipes4dev.tistory.com/55
        clear.setOnClickListener{}
        backSpace.setOnClickListener {  }
        percent.setOnClickListener {  }
        divide.setOnClickListener {  }
        multiply.setOnClickListener {  }
        add.setOnClickListener {  }
        subtract.setOnClickListener {  }
        equal.setOnClickListener {  }
        dot.setOnClickListener {  }
        zero.setOnClickListener {  }
        doubleZero.setOnClickListener {  }
        one.setOnClickListener {  }
        two.setOnClickListener {  }
        three.setOnClickListener {  }
        four.setOnClickListener {  }
        five.setOnClickListener {  }
        six.setOnClickListener {  }
        seven.setOnClickListener {  }
        eight.setOnClickListener {  }
        nine.setOnClickListener {  }
                    }
    private fun expressionText(str:String){
        expression.text = str
    }
    private fun resultText(){}
}