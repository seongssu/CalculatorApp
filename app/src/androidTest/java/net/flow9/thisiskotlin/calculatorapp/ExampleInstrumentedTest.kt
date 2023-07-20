package net.flow9.thisiskotlin.calculatorapp

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)      //Runner를 명시적으로 지정한다.
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext //를 이용하여 필요한 뷰를 만들어준다.
        assertEquals("net.flow9.thisiskotlin.calculatorapp", appContext.packageName)
        //assertEquals(A,B) : 객체 A와 B가 같은 값을 가지는지 확인한다.
        //packageName은 애플리케이션을 구분하는 고유한 값이다. 다른 앱과 구분하는 역할을 하므로 유일무이해야한다.
        //net.flow9.thisiskotlin.calculatorapp : 현재앱의 이름인가? 이건 모르겠다.
    }
}