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
    private lateinit var percent: Button
    private lateinit var divide: Button
    private lateinit var multiply: Button
    private lateinit var add: Button
    private lateinit var subtract: Button
    private lateinit var equal: Button
    private lateinit var dot: Button
    private lateinit var zero: Button
    private lateinit var doubleZero: Button
    private lateinit var one: Button
    private lateinit var two: Button
    private lateinit var three: Button
    private lateinit var four: Button
    private lateinit var five: Button
    private lateinit var six: Button
    private lateinit var seven: Button
    private lateinit var eight: Button
    private lateinit var nine: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        expression = findViewById(R.id.expression)
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

        var str: String
        //Listener : 위젯에서 발생한 특정 이벤트를 처리하기위해 리스너를 사용한다. 즉 어떤 이벤트의 발생 여부에 귀기울이는 객체
        //버튼에서 발생할 수있는 클릭 이벤트는 부모 클래스에서 정의를 한다.
        //이벤트 발생 시 호출될 함수를 구현한 리스너 객체를 생성하여 Button에 지정
        //참조 : https://recipes4dev.tistory.com/55
        clear.setOnClickListener {
            expressionText("0")
//            result.textSize = 60F         //F가 도대체 뭔가? sp,dp처럼 단위인가? 아니면 일정비율(F)로 곱하는건가?
//            result.textSize = 30F
            resultText()    //추상메소드
        }
        backSpace.setOnClickListener {
            if (expression.text.toString().isNotEmpty()) {
                var lastIndex = expression.text.toString().lastIndex
                str = expression.text.toString().substring(0, lastIndex)
                //substring: 문자열 시작위치(0번째)부터 lastIndex전까지(lastIndex는 포함X) 문자열을 불러온다.
                expressionText(str)
                resultText()
            }
        }
        percent.setOnClickListener {
            if (expression.text.toString().endsWith("%") || expression.text.toString()
                    .endsWith("/") || expression.text.toString()
                    .endsWith("X") || expression.text.toString()
                    .endsWith("+") || expression.text.toString()
                    .endsWith("-") || expression.text.toString().endsWith(".")
            //문자열이 지정 문자열로 끝나는지 체크. 즉 마지막 글자가  /,X,+,-로 끝나는지 확인
            ) {
                str = expression.text.toString()
                expressionText(str)
            } else {
                str = expression.text.toString() + "%"
                expressionText(str)
            }
        }
        divide.setOnClickListener {
            if (expression.text.toString().endsWith("%") || expression.text.toString()
                    .endsWith("/") || expression.text.toString()
                    .endsWith("X") || expression.text.toString()
                    .endsWith("+") || expression.text.toString()
                    .endsWith("-") || expression.text.toString().endsWith(".")
            //문자열이 지정 문자열로 끝나는지 체크. 즉 마지막 글자가  /,X,+,-로 끝나는지 확인
            ) {
                str = expression.text.toString()
                expressionText(str)
            } else {
                str = expression.text.toString() + "/"
                expressionText(str)
            }
        }
        multiply.setOnClickListener {
            if (expression.text.toString().endsWith("%") || expression.text.toString()
                    .endsWith("/") || expression.text.toString()
                    .endsWith("X") || expression.text.toString()
                    .endsWith("+") || expression.text.toString()
                    .endsWith("-") || expression.text.toString().endsWith(".")
            //문자열이 지정 문자열로 끝나는지 체크. 즉 마지막 글자가  /,X,+,-로 끝나는지 확인
            ) {
                str = expression.text.toString()
                expressionText(str)
            } else {
                str = expression.text.toString() + "X"
                expressionText(str)
            }
        }
        add.setOnClickListener {
            if (expression.text.toString().endsWith("%") || expression.text.toString()
                    .endsWith("/") || expression.text.toString()
                    .endsWith("X") || expression.text.toString()
                    .endsWith("+") || expression.text.toString()
                    .endsWith("-") || expression.text.toString().endsWith(".")
            //문자열이 지정 문자열로 끝나는지 체크. 즉 마지막 글자가  /,X,+,-로 끝나는지 확인
            ) {
                str = expression.text.toString()
                expressionText(str)
            } else {
                str = expression.text.toString() + "+"
                expressionText(str)
            }
        }
        subtract.setOnClickListener {
            if (expression.text.toString().endsWith("%") || expression.text.toString()
                    .endsWith("/") || expression.text.toString()
                    .endsWith("X") || expression.text.toString()
                    .endsWith("+") || expression.text.toString()
                    .endsWith("-") || expression.text.toString().endsWith(".")
            //문자열이 지정 문자열로 끝나는지 체크. 즉 마지막 글자가  /,X,+,-로 끝나는지 확인
            ) {
                str = expression.text.toString()
                expressionText(str)
            } else {
                str = expression.text.toString() + "-"
                expressionText(str)
            }
        }
        equal.setOnClickListener {
//            expression.textSize = 30F
//            result.textSize = 60F
        }
        dot.setOnClickListener {
            if (expression.text.toString().endsWith("%") || expression.text.toString()
                    .endsWith("/") || expression.text.toString()
                    .endsWith("X") || expression.text.toString()
                    .endsWith("+") || expression.text.toString()
                    .endsWith("-") || expression.text.toString().endsWith(".")
            //문자열이 지정 문자열로 끝나는지 체크. 즉 마지막 글자가  /,X,+,-로 끝나는지 확인
            ) {
                str = expression.text.toString()
                expressionText(str)
            } else {
                str = expression.text.toString() + "."
                expressionText(str)
            }
        }
        zero.setOnClickListener {
            if (expression.text.toString().startsWith("0")) {
                str = expression.text.toString().replace("0", "") +"0"
                //replace([기존문자],[바꿀문자]) : 기존문자를 모두 바꿀문자로 바꾼다. 문자열 치환기능
                //String a = "가.나.다.라.마"
                //a= a.replace(".","/");    -> 가/나/다/라/마    각각 바꿔주는데
                //a= a.replaceAll(".","/"); -> ////////////    정규식으로 모든 문자를 의미해서 전체 바꿈
                expressionText(str)
                resultText()
            }else{
                str = expression.text.toString()+"0"
                expressionText(str)
                resultText()
            }
        }
        doubleZero.setOnClickListener {
            if (expression.text.toString().startsWith("0")) {
                str = expression.text.toString().replace("0", "") +"00"
                expressionText(str)
                resultText()
            }else{
                str = expression.text.toString()+"00"
                expressionText(str)
                resultText()
            }
        }
        one.setOnClickListener {
            if (expression.text.toString().startsWith("0")) {
                str = expression.text.toString().replace("0", "") +"1"
                expressionText(str)
                resultText()
            }else{
                str = expression.text.toString()+"1"
                expressionText(str)
                resultText()
            }
        }
        two.setOnClickListener {
            if (expression.text.toString().startsWith("0")) {
                str = expression.text.toString().replace("0", "") +"2"
                expressionText(str)
                resultText()
            }else{
                str = expression.text.toString()+"2"
                expressionText(str)
                resultText()
            }
        }
        three.setOnClickListener {
            if (expression.text.toString().startsWith("0")) {
                str = expression.text.toString().replace("0", "") +"3"
                expressionText(str)
                resultText()
            }else{
                str = expression.text.toString()+"3"
                expressionText(str)
                resultText()
            }
        }
        four.setOnClickListener {
            if (expression.text.toString().startsWith("0")) {
                str = expression.text.toString().replace("0", "") +"4"
                expressionText(str)
                resultText()
            }else{
                str = expression.text.toString()+"4"
                expressionText(str)
                resultText()
            }
        }
        five.setOnClickListener {
            if (expression.text.toString().startsWith("0")) {
                str = expression.text.toString().replace("0", "") +"5"
                expressionText(str)
                resultText()
            }else{
                str = expression.text.toString()+"5"
                expressionText(str)
                resultText()
            }
        }
        six.setOnClickListener {if (expression.text.toString().startsWith("0")) {
            str = expression.text.toString().replace("0", "") +"6"
            expressionText(str)
            resultText()
        }else{
            str = expression.text.toString()+"6"
            expressionText(str)
            resultText()
        } }
        seven.setOnClickListener {
            if (expression.text.toString().startsWith("0")) {
                str = expression.text.toString().replace("0", "") +"7"
                expressionText(str)
                resultText()
            }else{
                str = expression.text.toString()+"7"
                expressionText(str)
                resultText()
            }
        }
        eight.setOnClickListener {
            if (expression.text.toString().startsWith("0")) {
                str = expression.text.toString().replace("0", "") +"8"
                expressionText(str)
                resultText()
            }else{
                str = expression.text.toString()+"8"
                expressionText(str)
                resultText()
            }
        }
        nine.setOnClickListener {
            if (expression.text.toString().startsWith("0")) {
                str = expression.text.toString().replace("0", "") +"9"
                expressionText(str)
                resultText()
            }else{
                str = expression.text.toString()+"9"
                expressionText(str)
                resultText()
            }
        }
    }

    private fun expressionText(str: String) {
        expression.text = str
    }

    private fun resultText() {
    }
}