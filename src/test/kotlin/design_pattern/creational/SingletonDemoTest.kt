package design_pattern.creational

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SingletonDemoTest {

    @Test
    fun log() {
        val singletonInstance1 = SingletonDemo.log()
        val singletonInstance2 = SingletonDemo.log()
        Assertions.assertSame(singletonInstance1, SingletonDemo)
        Assertions.assertSame(singletonInstance2, SingletonDemo)
        Assertions.assertSame(singletonInstance1, singletonInstance1)
    }
}